package com.sdnext.hibernate.premierleague.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="PREMIER_LEAGUE")
public class TeamsTable implements Serializable 
{

    /**
    * serialVersionUID
    */
    private static final long serialVersionUID = 8633415090390966715L;
    @Id
    @Column(name="ID")

    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;


    @Column(name="POS")
    private int posNumber;
    @Column(name="TEAM_NAME")
    private String teamName;
    @Column(name="P")
    private int playedTeam;
    @Column(name="W")
    private int winsTeam;
    @Column(name="D")
    private int drawsTeam;
    @Column(name="L")
    private int lossesTeam;
    @Column(name="F")
    private int goalsForTeam;
    @Column(name="A")
    private int goalsAgainstTeam;
    @Column(name="D")
    private int goalDifferenceTeam;
    @Column(name="PTS")
    private int pointsTeam;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }   
    public int getPosNumber() {
        return posNumber;
    }
    public void setPosNumber(int posNumber) {
        this.posNumber = posNumber;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public int getPlayedTeam() {
        return playedTeam;
    }
    public void setPointsTeam(int playedTeam) {
        this.playedTeam = playedTeam;
    }
    public int getWinsTeam() {
        return winsTeam;
    }
    public void setWinsTeam(int winsTeam) {
        this.winsTeam = winsTeam;
    }
    public int getDrawsTeam() {
        return drawsTeam;
    }
    public void setDrawsTeam(int drawsTeam) {
        this.drawsTeam = drawsTeam;
    }
    public int getLossesTeam() {
        return lossesTeam;
    }
    public void setLossesTeam(int lossesTeam) {
        this.lossesTeam = lossesTeam;
    }
    public int getGoalsForTeam() {
        return goalsForTeam;
    }
    public void setGoalsForTeam(int goalsForTeam) {
        this.goalsForTeam = goalsForTeam;
    }
    public int getGoalsAgainstTeam() {
        return goalsAgainstTeam;
    }
    public void setGoalsAgainstTeam(int goalsAgainstTeam) {
        this.goalsAgainstTeam = goalsAgainstTeam;
    }
    public int getGoalDifferenceTeam() {
        return goalDifferenceTeam;
    }
    public void setGoalDifferenceTeam(int goalDifferenceTeam) {
        this.goalDifferenceTeam = goalDifferenceTeam;
    }
    public int getPointsTeam() {
        return pointsTeam;
    }
    public void setPointsTeam(int pointsTeam) {
        this.pointsTeam = pointsTeam;
    }

    @Override
    public String toString() {
        return "PremierLeague [id=" + id + ", posNumber=" + posNumber
                + ", teamName=" + teamName + ", pointsTeam=" + pointsTeam
                + ", winsTeam=" + winsTeam + ", drawsTeam=" + drawsTeam
                + ", lossesTeam=" + lossesTeam + ", goalsForTeam="
                + goalsForTeam + ", goalsAgainstTeam=" + goalsAgainstTeam
                + ", goalDifferenceTeam=" + goalDifferenceTeam
                + ", pointsTeam=" + pointsTeam + "]";
    }

}