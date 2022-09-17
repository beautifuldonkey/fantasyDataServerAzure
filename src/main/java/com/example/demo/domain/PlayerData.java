package com.example.demo.domain;



public class PlayerData {


  private int id;

  // player info data
  private String name;

  private double year;

  private double week;

  private String home;

  private String team;

  private String pos;

  // defense data
  private double defAst;

  private double defFFum;

  private double defInt;

  private double defSk;

  private double defTkl;

  // fumble data
  private double fumLost;

  private double fumRcvr;

  private double fumTot;

  private double fumTotRcvr;

  private double fumYds;

  // kicking data
  private double kickFgA;

  private double kickFgM;

  private double kickFgYds;

  private double kickTotPFg;

  private double kickExPtAtt;


  // receiving data
  private double recLng;

  private double recLngTd;

  private double recRec;

  private double recTwoPtAtt;

  private double recTwoPtMade;

  private double recYds;

  private double recTds;

  // rushing data
  private double rushAtt;

  private double rushYds;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getYear() {
    return year;
  }

  public void setYear(double year) {
    this.year = year;
  }

  public double getWeek() {
    return week;
  }

  public void setWeek(double week) {
    this.week = week;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getPos() {
    return pos;
  }

  public void setPos(String pos) {
    this.pos = pos;
  }

  public double getDefAst() {
    return defAst;
  }

  public void setDefAst(double defAst) {
    this.defAst = defAst;
  }

  public double getDefFFum() {
    return defFFum;
  }

  public void setDefFFum(double defFFum) {
    this.defFFum = defFFum;
  }

  public double getDefInt() {
    return defInt;
  }

  public void setDefInt(double defInt) {
    this.defInt = defInt;
  }

  public double getDefSk() {
    return defSk;
  }

  public void setDefSk(double defSk) {
    this.defSk = defSk;
  }

  public double getDefTkl() {
    return defTkl;
  }

  public void setDefTkl(double defTkl) {
    this.defTkl = defTkl;
  }

  public double getFumLost() {
    return fumLost;
  }

  public void setFumLost(double fumLost) {
    this.fumLost = fumLost;
  }

  public double getFumRcvr() {
    return fumRcvr;
  }

  public void setFumRcvr(double fumRcvr) {
    this.fumRcvr = fumRcvr;
  }

  public double getFumTot() {
    return fumTot;
  }

  public void setFumTot(double fumTot) {
    this.fumTot = fumTot;
  }

  public double getFumTotRcvr() {
    return fumTotRcvr;
  }

  public void setFumTotRcvr(double fumTotRcvr) {
    this.fumTotRcvr = fumTotRcvr;
  }

  public double getFumYds() {
    return fumYds;
  }

  public void setFumYds(double fumYds) {
    this.fumYds = fumYds;
  }

  public double getKickFgA() {
    return kickFgA;
  }

  public void setKickFgA(double kickFgA) {
    this.kickFgA = kickFgA;
  }

  public double getKickFgM() {
    return kickFgM;
  }

  public void setKickFgM(double kickFgM) {
    this.kickFgM = kickFgM;
  }

  public double getKickFgYds() {
    return kickFgYds;
  }

  public void setKickFgYds(double kickFgYds) {
    this.kickFgYds = kickFgYds;
  }

  public double getKickTotPFg() {
    return kickTotPFg;
  }

  public void setKickTotPFg(double kickTotPFg) {
    this.kickTotPFg = kickTotPFg;
  }

  public double getKickExPtAtt() {
    return kickExPtAtt;
  }

  public void setKickExPtAtt(double kickExPtAtt) {
    this.kickExPtAtt = kickExPtAtt;
  }

    public double getRecLng() {
        return recLng;
    }

    public void setRecLng(double recLng) {
        this.recLng = recLng;
    }

    public double getRecLngTd() {
        return recLngTd;
    }

    public void setRecLngTd(double recLngTd) {
        this.recLngTd = recLngTd;
    }

    public double getRecRec() {
        return recRec;
    }

    public void setRecRec(double recRec) {
        this.recRec = recRec;
    }

    public double getRecTwoPtAtt() {
        return recTwoPtAtt;
    }

    public void setRecTwoPtAtt(double recTwoPtAtt) {
        this.recTwoPtAtt = recTwoPtAtt;
    }

    public double getRecTwoPtMade() {
        return recTwoPtMade;
    }

    public void setRecTwoPtMade(double recTwoPtMade) {
        this.recTwoPtMade = recTwoPtMade;
    }

    public double getRecYds() {
        return recYds;
    }

    public void setRecYds(double recYds) {
        this.recYds = recYds;
    }

    public double getRecTds() {
        return recTds;
    }

    public void setRecTds(double recTds) {
        this.recTds = recTds;
    }

    public double getRushAtt() {
        return rushAtt;
    }

    public void setRushAtt(double rushAtt) {
        this.rushAtt = rushAtt;
    }

    public double getRushYds() {
        return rushYds;
    }

    public void setRushYds(double rushYds) {
        this.rushYds = rushYds;
    }

    @Override
  public String toString() {
    return "PlayerData{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", year=" + year +
        ", week=" + week +
        ", home='" + home + '\'' +
        ", team='" + team + '\'' +
        ", pos='" + pos + '\'' +
        '}';
  }
}
