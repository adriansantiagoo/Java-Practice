package Collections.TrafficAnalytics_system;

import java.util.HashMap;

public class AnalyticsEngine {
    private HashMap<String, UrlStats> urls = new HashMap<>();

    public void urlStats(String url){
        if (notContainsUrl(url)){
            System.out.println("This url doesn't exists.");
            return;
        }
        System.out.println(urls.get(url).toString());
    }

    public void visitUrl(String url, String userId){
        if (notContainsUrl(url)){
            urls.put(url, new UrlStats());
        }
        updateStats(url, userId);
    }

    public int getTotalViewsUrl(String url){
        if (notContainsUrl(url)){
            System.out.println("This url does not exists.");
            return -1;
        }
        return urls.get(url).getTotalPageViews();
    }

    public int getTotalUsersUrl(String url){
        if (notContainsUrl(url)){
            System.out.println("This url does not exists.");
            return -1;
        }
        return urls.get(url).getUsers().size();
    }

    public void updateStats(String url, String userId){
        urls.get(url).recordVisit(userId);
    }

    public boolean notContainsUrl(String url){
        return !urls.containsKey(url);
    }
}
