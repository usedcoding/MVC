package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        Scanner sc = new Scanner(System.in);
        long id = 0;

        Member loginedMember = null;

        List<WiseSaying> wiseSayingList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>();

        while(true) {
            System.out.print("명령어 ) ");

            String command = sc.nextLine();

            if(command.equals("종료")) {
                System.out.println("시스템 종료");
                break;

            }else if (command.equals("회원가입")) {
                    String userId;
                    String password;
                    String confirmPassword;

                while(true) {
                    System.out.print("아이디 ) ");
                    userId = sc.nextLine().trim();

                    boolean duplicatedUserId = false;

                    for(int i = 0; i < memberList.size(); i++) {
                        if(memberList.get(i).getUserId().equals(userId)) {
                           duplicatedUserId = true;
                        }
                    }

                    if(duplicatedUserId) {
                        System.out.println("이미 존재하는 아이디 입니다.");
                    }
                    break;
                }

                while (true) {
                    System.out.print("비밀번호 ) ");
                    password = sc.nextLine().trim();

                    System.out.print("비밀번호 확인 ) ");
                    confirmPassword = sc.nextLine().trim();

                    for(int i = 0; i < memberList.size(); i++) {
                        if(!password.equals(confirmPassword)) {
                            System.out.println("비밀번호가 일치하지 않습니다");
                        }
                        continue;
                    }
                    break;

                    //비밀번호와 비밀번호 확인에 다른 내용을 작성 하였으나 회원 가입이 완료 되었다고 출력

                }
                Member member = new Member(userId, password, confirmPassword);
                memberList.add(member);


                System.out.println(userId + " 님 회원가입이 완료 되었습니다.");



            }else if(command.equals("로그인")){

                boolean checkedUSerId = false;
                Member member = null;
                System.out.print("아이디 ) ") ;
                String userId = sc.nextLine().trim();

                System.out.print("비밀번호 ) ");
                String password = sc.nextLine().trim();

                for(int i = 0; i < memberList.size(); i++) {
                    if(memberList.get(i).getUserId().equals(userId)) {
                        member = memberList.get(i);
                        checkedUSerId = true;
                        break;
                    }
                }

                if(checkedUSerId = false) {
                    System.out.println("아이디를 확인해 주세요");
                    return;
                }

                if(member.getPassword().equals(password) == false) {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    return;
                }

                loginedMember = member;

                System.out.println(loginedMember.getUserId() + "님 로그인 되었습니다.");


            }else if(command.equals("등록")) {
                id++;

                System.out.print("제목 ) ");
                String title = sc.nextLine();

                System.out.print("내용 ) ");
                String content = sc.nextLine();

                System.out.println(id + "번 게시글이 등록 되었습니다.");
                WiseSaying wiseSaying = new WiseSaying(id, title, content);
                wiseSayingList.add(wiseSaying);

            }else if(command.equals("목록")) {
                System.out.println("번호 / 제목 / 내용");

                for(int i = 0; i < wiseSayingList.size(); i++) {
                    WiseSaying wiseSaying = wiseSayingList.get(i);
                    System.out.printf("%d, %s, %s \n", wiseSaying.getId(), wiseSaying.getTitle(), wiseSaying.getContent());
                }

            }else if(command.equals("삭제")) {
                System.out.print("삭제할 번호를 입력해 주세요 ) ");

                long removeId = sc.nextLong();
                sc.nextLine();

                for(int i = 0; i < wiseSayingList.size(); i++) {
                    WiseSaying wiseSaying = wiseSayingList.get(i);

                    if(removeId == wiseSaying.getId()) {
                        wiseSayingList.remove(wiseSaying);
                    }
                }

                System.out.println(removeId + "번 게시글이 삭제 되었습니다.");
            }else if(command.equals("수정")) {
                System.out.print("수정할 번호를 입력해 주세요 ) ");
                long modifyId = sc.nextLong();
                sc.nextLine();

                for(int i = 0; i < wiseSayingList.size(); i++) {
                    WiseSaying wiseSaying = wiseSayingList.get(i);

                    if(modifyId == wiseSaying.getId()) {
                        System.out.println("기존 제목 : " + wiseSaying.getTitle());

                        System.out.print("수정 : ");
                        String title = sc.nextLine();
                        wiseSaying.setTitle(title);

                        System.out.println("기존 내용 : " + wiseSaying.getContent());

                        System.out.print("수정 : ");
                        String content = sc.nextLine();
                        wiseSaying.setContent(content);
                    }
                }
            }

        }
    }
}
