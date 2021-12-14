import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MainAdapter {

  public static void main(String[] args) {
    EmailCampaignFlowDetailAdapter<EmailCampaignAdapter> emailCampaign = new EmailCampaignAdapter(1,
        "tessiCampaign",
        "tess.com");

    emailCampaign.setEmailCampaignFlowCreationAdapter(emailCampaign.getEmailCampaignFlowCreation());
//    System.out.println(emailCampaign.getEmailCampaignFlowCreationAdapter().toString());
    MainAdapter dd = new MainAdapter();
    dd.getMapProfile();

  }


  public void getMapProfile() {
    var collects = getProfiles().stream().collect(Collectors.groupingBy(Profile::getFuncKey));
    var result = collects.keySet().stream()
        .map(e -> (collects.get(e).size() > 1) ? getTopProfile(collects.get(e)) : collects.get(e))
        .collect(Collectors.toList());

    System.out.println(result);
  }

  public List<Profile> getProfiles() {
    List<Profile> profiles = new ArrayList<>();
    profiles.add(new Profile("cxm_template", 1, "owner", "user"));
    profiles.add(new Profile("cxm_template", 2, "owner", "user"));
    profiles.add(new Profile("cxm_template", 3, "service", "user"));
    profiles.add(new Profile("cxm_campaign", 4, "client", "user"));
    profiles.add(new Profile("cxm_campaign", 5, "owner", "user"));
    profiles.add(new Profile("cxm_flowtracability", 1, "owner", "user"));
    return profiles;
  }

  public Profile getTopProfile(List<Profile> profiles) {
    var collect = profiles.stream().map(Profile::getModificationLevel);
    AtomicInteger index = new AtomicInteger();
    var map = new HashMap<Integer, Integer>();
    collect.forEach((e) -> {
      System.out.println(e);
      for (var m : ModificationLevel.values()) {
        if (m.getKey().equals(e)) {
          map.put(m.getValue(), index.intValue());
        }
      }
      index.getAndIncrement();
    });
    final var topLevelIndex = map.keySet().stream().min(Integer::compareTo).map(map::get)
        .orElseGet(null);

    return profiles.get(topLevelIndex);
  }
}
