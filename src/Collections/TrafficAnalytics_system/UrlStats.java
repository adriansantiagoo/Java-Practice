package Collections.TrafficAnalytics_system;

import java.util.HashSet;

public class UrlStats {
    private HashSet<String> users = new HashSet<>();
    private int totalPageViews;
    
    @Override
    public String toString(){
        return "Users: " + users.toString() + " | Total page views" + totalPageViews;
    }

    public void recordVisit(String userId){
        users.add(userId);
        totalPageViews++;
    }
    
    public HashSet<String> getUsers() {
        return new HashSet<>(users);
    }
    public void setUsers(HashSet<String> users) {
        this.users = users;
    }
    public int getTotalPageViews() {
        return totalPageViews;
    }
    public void setTotalPageViews(int totalPageViews) {
        this.totalPageViews = totalPageViews;
    }
}
