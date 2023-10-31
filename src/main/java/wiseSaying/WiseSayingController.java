package wiseSaying;

import org.example.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    long id = 0;

    List<WiseSaying> wiseSayingList = new ArrayList<>();

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

        System.out.println(id + "번 게시글이 등록 되었습니다.");
        WiseSaying wiseSaying = new WiseSaying(id, title, content);
        wiseSayingList.add(wiseSaying);
    }

    public void list() {
        System.out.println("번호 / 제목 / 내용");
        for (int i = 0; i < wiseSayingList.size(); i++) {
            WiseSaying wiseSaying = wiseSayingList.get(i);
            System.out.printf("%d, %s, %s \n", wiseSaying.getId(), wiseSaying.getTitle(), wiseSaying.getContent());
        }
    }

    public void remove() {
        System.out.print("삭제할 번호를 입력해 주세요 ) ");

        long removeId = sc.nextLong();
        sc.nextLine();

        WiseSaying wiseSaying = wiseSayingFindById(id);

            if (removeId == wiseSaying.getId()) {
                wiseSayingList.remove(wiseSaying);
            }
        

        System.out.println(removeId + "번 게시글이 삭제 되었습니다.");
    }

    public void modify() {
        System.out.print("수정할 번호를 입력해 주세요 ) ");
        long modifyId = sc.nextLong();
        sc.nextLine();


        WiseSaying wiseSaying = this.wiseSayingFindById(id);

        if (modifyId == wiseSaying.getId()) {
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
    private WiseSaying wiseSayingFindById(long id) {
        for (int i = 0; i <wiseSayingList.size(); i++){
            WiseSaying wiseSaying = wiseSayingList.get(i);
            if (wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }
}




