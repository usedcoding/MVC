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
        List<Member> memberList = new ArrayList<>();

        while (true) {
            System.out.print("명령어 ) ");

            String command = sc.nextLine();

            switch (command) {
                case "종료":
                    System.out.println("시스템 종료");
                    return;
//                case "회원가입" :
//                    System.out.print("아이디 ) ");
//                    String userId = sc.nextLine();
//
//                    while(true) {
//                        for(int i = 0; i < memberList.size(); i++) {
//                        Member member = memberList.get(i);
//                            if(member.getUserId().equals(member)) {
//                                System.out.println("이미 존재하는 아이디 입니다.");
//                                continue;
//                            }
//                        }
//                        break;
//                    }
//                    System.out.print("비밀 번호 ) ");
//                    String password = sc.nextLine();
//
//                    System.out.print("비밀 번호 확인 ) ");
//                    String passwordConfirm = sc.nextLine();
//
//                    if(!password.equals(passwordConfirm)) {
//                        System.out.println("비밀 번호를 확인해 주세요.");
//                    }
//
//                    Member member = new Member(userId, password);
//                    memberList.add(member);
//
//                    System.out.println(userId + " 회원가입 되었습니다. ");
//                    continue;

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


            sc.close();
        }
    }
}





