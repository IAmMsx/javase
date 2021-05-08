package com.objectOriented1.CustomerInformationManagement;

public class CustomerView {

    private static CustomerList custList = new CustomerList(10);
    private boolean loopFlag = true;

    public void enterMainMenu() {
        while (loopFlag) {
            System.out.println("******************客户信息管理********************");
            System.out.println();
            System.out.println("1 添加客户");
            System.out.println("2 修改客户");
            System.out.println("3 删除客户");
            System.out.println("4 客户列表");
            System.out.println("5 退   出");
            System.out.println();
            System.out.println("请选择 （1-5）：");
            char c = CMUtility.readMenuSelection();
            if (c == '1') {
                addNewCustomer();
            } else if (c == '2') {
                modifyCustomer();
            } else if (c == '3') {
                deleteCustomer();
            } else if (c == '4') {
                listAllCustomer();
            } else if (c == '5') {
                loopFlag = false;
            }
        }


    }

    private void addNewCustomer() {
        Customer tempCust = new Customer();
        System.out.println("*******************添加客户*********************");
        System.out.print("姓名：");
        String str = CMUtility.readString(10);
        tempCust.setName(str);
        System.out.print("性别：");
        char chr = CMUtility.readChar();
        tempCust.setGender(chr);
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        tempCust.setAge(age);
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        tempCust.setPhone(phone);
        System.out.print("邮箱：");
        String email = CMUtility.readString(50);
        tempCust.setEmail(email);

        custList.addCustomer(tempCust);

        System.out.println("*******************添加完成*********************");

    }

    private void modifyCustomer() {
        System.out.println("*******************修改客户*********************");
        System.out.print("请输入待修改用户编号（-1）退出：");
        int index = CMUtility.readInt();
        if (index == -1) return;
        if (index < 0 || index >= custList.getTotal()) {
            System.out.println("无此用户");
            return;
        }
        Customer tempCust = new Customer();
        Customer thisCust = custList.getCustomer(index);

        System.out.print("姓名(" + thisCust.getName() + "):");
        String str = CMUtility.readString(10, thisCust.getName());
        tempCust.setName(str);

        System.out.print("性别(" + thisCust.getGender() + "):");
        char gender = CMUtility.readChar(thisCust.getGender());
        tempCust.setGender(gender);

        System.out.print("年龄(" + thisCust.getAge() + "):");
        int age = CMUtility.readInt(thisCust.getAge());
        tempCust.setAge(age);

        System.out.print("电话(" + thisCust.getPhone() + "):");
        String phone = CMUtility.readString(13, thisCust.getPhone());
        tempCust.setPhone(phone);

        System.out.print("邮箱(" + thisCust.getEmail() + "):");
        String email = CMUtility.readString(50, thisCust.getEmail());
        tempCust.setEmail(email);

        custList.replaceCustomer(index, tempCust);

        System.out.println("*******************修改完成*********************");


    }

    private void deleteCustomer() {
        System.out.println("*******************删除客户*********************");
        System.out.print("请输入待删除用户编号（-1）退出：");
        int index = CMUtility.readInt();
        if (index == -1) return;
        System.out.print("确认是否删除（Y/N）：");
        char confirm = CMUtility.readConfirmSelection();
        if (confirm == 'N') return;
        custList.deleteCustomer(index);
        System.out.println("*******************删除完成*********************");
    }

    private void listAllCustomer() {
        System.out.println("*******************客户列表**********************");
        int total = custList.getTotal();
        if (total == 0) {
            System.out.println("无客户！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            for (int i = 0; i < total; i++) {
                System.out.println(total + 1 + "\t" + custList.getCustomer(i).toString());
            }
        }
        System.out.println("*****************客户列表完成*********************");


    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }

}
