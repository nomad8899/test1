package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public BookMenu() {}

    public void menu() {
        boolean sss = true;
        while (sss) {
            System.out.println("1. 책 추가");
            System.out.println("2. 책 전체 보기");
            System.out.println("3. 책 찾기");
            System.out.println("4. 책 삭제");
            System.out.println("9. 프로그램 종료");
            int num = sc.nextInt();
            switch (num) {
                case 1:

                    inputBook();
                    bm.addBook(inputBook()); break;

                case 2:
                    break;

                case 3:
                    break;
//                   num == 3 = bm.addBook();
                case 4:
                    break;
//                    num == 4 = bm.addBook();
                case 9:
                    System.out.println("프로그램 종료");
                    sss = false; return;
            }


        }
    }
    public BookDTO inputBook() {
//        System.out.println("도서 번호 입력 :");
//        int num = sc.nextInt();
        System.out.println("도서 분류코드 입력 :");
        int numBari = sc.nextInt();
        System.out.println("도서 제목 입력 :");
        String title = sc.next();
        System.out.println("도서 저자 입력 :");
        String author = sc.next();

        return new BookDTO(numBari,title,author);

    }

//    public String inputBooktitle() {
//
//    }
}
