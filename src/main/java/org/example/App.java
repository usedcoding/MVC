package org.example;

import org.example.wiseSaying.WiseSaying;
import org.example.wiseSaying.WiseSayingController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run () {
        Scanner sc = new Scanner(System.in);

        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        while(true) {
            System.out.println("명령어 ) ");
            String command = sc.nextLine();
            if(command.equals("종료")) {
                System.out.println("시스템 종료");
                break;
            }else if(command.equals("등록")) {

                wiseSayingController.create();

            }else if(command.equals("목록")) {

                wiseSayingController.list();

            }else if (command.equals("삭제")) {

               wiseSayingController.remove();

            }else if(command.equals("수정")) {

                wiseSayingController.modify();

                }
            }

        }
    }

