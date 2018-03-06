/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

/**
 *
 * @author x16440304
 */
public class MatchDay {
    private String homeTeam;
    private String awayTeam;
    private String referee;
    private String stadium;
    private String matchTime;
    private String matchDate;

    public MatchDay(String homeTeam, String awayTeam, String referee, String stadium, String matchTime, String matchDate) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee = referee;
        this.stadium = stadium;
        this.matchTime = matchTime;
        this.matchDate = matchDate;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }
    
    public String getInfo(String homeTeam,String awayTeam,String referee,String stadium,String matchTime,String matchDate) {
        String result = homeTeam+" vs. "+awayTeam+"\nReferee: "+referee+"\nVenue: "+stadium+"\nTime: "+matchTime+"\nDate: "+matchDate;
        return result; 
    }
    
    
    
}
