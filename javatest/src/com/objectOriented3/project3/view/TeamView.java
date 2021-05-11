package com.objectOriented3.project3.view;

import com.objectOriented3.project3.domain.Architect;
import com.objectOriented3.project3.domain.Designer;
import com.objectOriented3.project3.domain.Employee;
import com.objectOriented3.project3.domain.Programmer;
import com.objectOriented3.project3.service.NameListService;
import com.objectOriented3.project3.service.TeamException;
import com.objectOriented3.project3.service.TeamService;

public class TeamView {
    NameListService listSvc = new NameListService();
    TeamService teamSvc = new TeamService();
    private boolean loopFlag = true;


    public void enterMainMenu() {

        while (loopFlag) {
            System.out.println("********************************开发团队调度软件********************************");
            listAllEmployees();
            System.out.println("*****************************************************************************");
            System.out.print("1-团队列表\t2-添加团队成员\t3-删除团队成员\t4-退出\t请选择(1-4)： ");
            char c = TSutility.readMenuSelection();
            switch (c) {
                case '1':
                    listAllTeam();
                    break;
                case '2':
                    addMemberView();
                    break;
                case '3':
                    delMemberView();
                    break;
                case '4':
                    loopFlag = false;
            }
        }

    }

    public void listAllEmployees() {
        System.out.println("ID\t姓名\t年龄\t\t工资\t\t职位\t\t\t状态\t奖金\t\t股票\t\t领用设备\t");
        Employee[] listemees = listSvc.getAllEmployees();
        for (int i = 0; i < listemees.length; i++) {
            if (listemees[i] instanceof Architect) {
                Architect tempArc = (Architect) listemees[i];
                System.out.println(tempArc.toString() + "架构师\t" + tempArc.getStatus() + "\t" +
                        tempArc.getBonus() + "\t" + tempArc.getStock() + "\t" + tempArc.getEquipment().getDescription());
            } else if (listemees[i] instanceof Designer) {
                Designer tempDes = (Designer) listemees[i];
                System.out.println(tempDes.toString() + "设计师\t" + tempDes.getStatus() + "\t" + tempDes.getBonus() + "\t\t\t"
                        + tempDes.getEquipment().getDescription());
            } else if (listemees[i] instanceof Programmer) {
                Programmer tempPro = (Programmer) listemees[i];
                System.out.println(tempPro.toString() + "程序员\t" + tempPro.getStatus() + "\t\t\t\t\t" + tempPro.getEquipment().getDescription());
            } else {
                System.out.println(listemees[i].toString());
            }
        }

    }

    public void listAllTeam() {
        System.out.println("********************************团队成员列表********************************");
        System.out.println("TDI/ID\t姓名\t年龄\t\t工资\t\t职位\t\t\t状态\t奖金\t\t股票");
        Programmer[] tempPros = teamSvc.getTeam();
        for (int i = 0; i < tempPros.length; i++) {
            if (tempPros[i] instanceof Architect) {
                Architect tempArc = (Architect) tempPros[i];
                System.out.println(tempArc.getMemberId() + "/" + tempArc.toString() + "架构师\t" + tempArc.getBonus() + "\t" + tempArc.getStock());
            } else if (tempPros[i] instanceof Designer) {
                Designer tempDes = (Designer) tempPros[i];
                System.out.println(tempDes.getMemberId() + "/" + tempDes.toString() + "设计师\t" + tempDes.getBonus());
            } else if (tempPros[i] instanceof Programmer) {
                Programmer tempPro = (Programmer) tempPros[i];
                System.out.println(tempPro.getMemberId() + "/" + tempPro.toString() + "程序员\t");
            }
        }
    }

    public void addMemberView(){
        System.out.println("********************************添加成员**********************************");
        System.out.print("请输入要添加的员工ID：");
        int id = TSutility.readInt();


        try {
            Employee emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }finally {
            TSutility.readReturn();
        }
    }
    public void delMemberView(){
        System.out.println("********************************删除成员**********************************");
        System.out.print("请输入要删除的员工TID：");
        int id = TSutility.readInt();
        System.out.print("确认是否删除（Y/N）：");
        char tag = TSutility.readConfirmSelection();
        if (tag == 'Y'){
            try {
                teamSvc.removeMember(id);
                System.out.println("删除成功！");
            } catch (TeamException e) {
                System.out.println(e.getMessage());
            }
        }else {
            TSutility.readReturn();
        }
    }

    public static void main(String[] args) {
//        new TeamView().listAllEmployees();
//        new TeamView().listAllTeam();

        new TeamView().enterMainMenu();
    }
}
