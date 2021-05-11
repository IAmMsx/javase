package com.objectOriented3.project3.service;

import com.objectOriented3.project3.domain.*;

public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private int total = 0;

    Programmer[] team = new Programmer[MAX_MEMBER];

    public Programmer[] getTeam() {
        Programmer[] tempTeam = new Programmer[total];
        System.arraycopy(team, 0, tempTeam, 0, total);
        return tempTeam;
    }

    public void addMember(Employee employee) throws TeamException {
//        成员已满，无法添加 1
//        该成员不是开发人员，无法添加 1
//        该员已是团队成员 1
//        该员正在休假，无法添加 1
//        该员工已是团队成员
//        团队中只能有一名架构师
//        团队中只能有两名设计师
//        团队中只能有三名程序员
        if (total >= MAX_MEMBER) {
            throw new TeamException(" 成员已满，无法添加");
        }
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer e = (Programmer) employee;
        if ("VOCATION".equals(e.getStatus().toString())) {
            throw new TeamException("该员正在休假，无法添加");
        }


        for (int i = 0; i < total; i++) {
            if (e.getId() == team[i].getId()){
                throw new TeamException("该员工已是团队成员");
            }
        }
        int numArk = 0, numDes = 0, numPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) numArk++;
            else if (team[i] instanceof Designer) numDes++;
            else numPro++;
        }
        if (e instanceof Architect) {
            if (numArk == 1) {
                throw new TeamException("团队中只能有一名架构师");
            }
        } else if (e instanceof Designer) {
            if (numDes == 2) {
                throw new TeamException("团队中只能有两名设计师");
            }
        } else if (numPro == 3) {
            throw new TeamException("团队中只能有三名程序员");
        }


        // 添加成员
        team[total++] = e;
        e.setStatus(Status.BUSY);
        e.setMemberId(counter++);

    }

    public void removeMember(int memberID) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberID) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) {
            throw new TeamException("没找到指定对象");
        }
        if (total - 1 - i >= 0) System.arraycopy(team, i + 1, team, i, total - 1 - i);
        team[--total] = null;

    }

}
