package org.example;

import wiseSaying.WiseSayingController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        Scanner sc = new Scanner(System.in);

        WiseSayingController wiseSayingController = new WiseSayingController(sc);


//        Member loginedMember = null;
//
//
//        List<Member> memberList = new ArrayList<>();

        while (true) {
            System.out.print("명령어 ) ");

            String command = sc.nextLine();

            switch (command) {
                case "종료":
                    System.out.println("시스템 종료");
                    return;
                case "등록":
                    wiseSayingController.create();
                    break;
                case "목록":
                    wiseSayingController.list();
                    break;
                case "삭제":
                    wiseSayingController.remove();
                    break;
                case "수정":
                    wiseSayingController.modify();
                    break;
            }

//            if (command.equals("회원가입")) {
//
//                while (true) {
//                    System.out.print("아이디 ) ");
//                   String userId = sc.nextLine().trim();
//
//                    boolean duplicatedUserId = false;
//
//                    for (int i = 0; i < memberList.size(); i++) {
//                        if (memberList.get(i).getUserId().equals(userId)) {
//                            duplicatedUserId = true;
//                        }
//                    }
//
//                    if (duplicatedUserId) {
//                        System.out.println("이미 존재하는 아이디 입니다.");
//                    }
//                    break;
//                }
//
//                while (true) {
//                    System.out.print("비밀번호 ) ");
//                    String password = sc.nextLine().trim();
//
//                    System.out.print("비밀번호 확인 ) ");
//                    String confirmPassword = sc.nextLine().trim();
//
//
//                    if (!password.equals(confirmPassword)) {
//                        System.out.println("비밀번호가 일치하지 않습니다");
//                    }
//                    continue;
//
//                }
//                Member member = new Member(userId, password, confirmPassword);
//                memberList.add(member);
//
//
//
//                System.out.println(userId + " 님 회원가입이 완료 되었습니다.");
//
//
//            } else if (command.equals("로그인")) {
//
//                boolean checkedUSerId = false;
//                Member member = null;
//                System.out.print("아이디 ) ");
//                String userId = sc.nextLine().trim();
//
//                System.out.print("비밀번호 ) ");
//                String password = sc.nextLine().trim();
//
//                for (int i = 0; i < memberList.size(); i++) {
//                    if (memberList.get(i).getUserId().equals(userId)) {
//                        member = memberList.get(i);
//                        checkedUSerId = true;
//                        break;
//                    }
//                }
//
//                if (checkedUSerId = false) {
//                    System.out.println("아이디를 확인해 주세요");
//                    return;
//                }
//
//                if (member.getPassword().equals(password) == false) {
//                    System.out.println("비밀번호가 일치하지 않습니다.");
//                    return;
//                }
//
//                loginedMember = member;
//
//                System.out.println(loginedMember.getUserId() + "님 로그인 되었습니다.");
//
//
//            }
//
//        }

            sc.close();
        }
    }
}





