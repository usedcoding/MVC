package org.example.wiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    long id = 0;
    Scanner sc;

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }


    public void create() {
        id++;
        System.out.print("제목 ) ");
        String title = sc.nextLine();

        System.out.print("내용 ) ");
        String content = sc.nextLine();

        WiseSaying wiseSaying = new WiseSaying(id, title, content);
        wiseSayingList.add(wiseSaying);

        System.out.println(id + "번 게시글이 등록 되었습니다.");

    }

    public void list() {
        System.out.println("번호 / 제목 / 내용");
        for (int i = 0; i < wiseSayingList.size(); i++) {
            WiseSaying wiseSaying = wiseSayingList.get(i);
            System.out.printf("%d, %s, %s \n", wiseSaying.getId(), wiseSaying.getTitle(), wiseSaying.getContent());
        }

    }

    public void remove() {
        System.out.println("삭제할 번호를 입력해 주세요 ) ");
        long removeId = sc.nextLong();
        sc.nextLine();

        WiseSaying wiseSaying = wiseSayingFindById(id);

        if (wiseSaying.getId() == removeId) {
            wiseSayingList.remove(wiseSaying);
        }
    }


    public void modify() {
        System.out.println("수정할 번호를 입력해 주세요 ) ");
        long modifyId = sc.nextLong();
        sc.nextLine();

        WiseSaying wiseSaying = wiseSayingFindById(id);

        if (wiseSaying.getId() == modifyId) {
            System.out.println("기존 제목 : " + wiseSaying.getTitle());
            System.out.println("수정 ) ");
            String title = sc.nextLine();
            wiseSaying.setTitle(title);

            System.out.println("기존 내용 : " + wiseSaying.getContent());
            System.out.println("수정 ) ");
            String content = sc.nextLine();
            wiseSaying.setContent(content);

        }

    }
    private WiseSaying wiseSayingFindById(long id) {
        for(int i = 0; i < wiseSayingList.size(); i++) {
            WiseSaying wiseSaying = wiseSayingList.get(i);
            if(wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }
}
