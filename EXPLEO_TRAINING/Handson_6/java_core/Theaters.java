package java_core;

import java.util.Scanner;

public class Theaters {
 int id;
 String name;
 int screans;
 String location;

 public void setDetail(int id, String name,int screans,String location) {
  this.id = id;
  this.name = name;
  this.screans=screans;
  this.location=location;
 }

 void display() {
  System.out.println("Theatre details ");
  System.out.println("Id : " + id);
  System.out.println("Name : " + name);
  System.out.println("Total Screans : "+screans);
  System.out.println("Location "+location);
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  Theaters a[] = new Theaters[5];
  for (int i = 0; i < 5; i++) {
   a[i] = new Theaters();
  }
  for (int i = 0; i < 5; i++) {
   System.out.println("Enter Id and Name for Employee " + (i + 1));
   int id = s.nextInt();
   String name = s.next();
   int screans=s.nextInt();
   String location=s.next();
   a[i].setDetail(id, name,screans,location);
  }
  for (int i = 0; i < 5; i++) {
   a[i].display();
  }

}

}
