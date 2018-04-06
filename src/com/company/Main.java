package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stopLoop = false;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Chef> chefResume = new ArrayList<>();
        ArrayList<Education> learnResume = new ArrayList<>();
        ArrayList<Experience> workResume = new ArrayList<>();
        ArrayList<Skills> laborResume = new ArrayList<>();
        Chef terry = new Chef();
        Education learn = new Education();
        Experience work = new Experience();
        Skills labor = new Skills();
        String answer = "";

        chefResume.add(terry);
        learnResume.add(learn);
        workResume.add(work);
        laborResume.add(labor);





        do {
            System.out.println("Enter your name : ");
            terry.setName(keyboard.nextLine());

            System.out.println("Enter Email : ");
            terry.setEmail(keyboard.nextLine());

            System.out.println("Enter Education : ");
            learn.setHighSchool(keyboard.nextLine());
            learn.setCollege(keyboard.nextLine());
            learn.setPhd(keyboard.nextLine());

            System.out.println("Enter your Experience: ");
            work.setFirstJob(keyboard.nextLine());
            work.setSecondJob(keyboard.nextLine());
            work.setThirdJob(keyboard.nextLine());

            System.out.println("Enter you Skills : ");
            labor.setKnife(keyboard.nextLine());
            labor.setCook(keyboard.nextLine());
            labor.setManage(keyboard.nextLine());


            System.out.println("Would you like to continue ?  Yes/No ");
            answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N")) {


                stopLoop = true;
            }
        }while (!stopLoop);


        for (Chef eachChef : chefResume){
            System.out.println(eachChef.getName());
            System.out.println(eachChef.getEmail());
            }
            for (Education eachEducation : learnResume){
                System.out.println(eachEducation.getHighSchool());
                System.out.println(eachEducation.getCollege());
                System.out.println(eachEducation.getPhd());
            }
            for (Experience eachExperience : workResume){
                System.out.println(eachExperience.getFirstJob());
                System.out.println(eachExperience.getSecondJob());
                System.out.println(eachExperience.getThirdJob());

                }
                for (Skills eachSkills : laborResume){
                    System.out.println(eachSkills.getKnife());
                    System.out.println(eachSkills.getCook());
                    System.out.println(eachSkills.getManage());
                }
        }
}
//    Robo Resume Assignment
//        Write a Java console application that will display a resume in an organized format. The resume must include:
//
//        - a name,
//        - an email address,
//        - multiple educational achievements,
//        - multiple experiences,
//        - multiple skills with a rating (e.g. 1 to 5, or beginner to proficient)
//
//        John J Jingleheimer-Schmidt
//        jjjschmidt@gmail.com
//
//Education
//        BS in Psychology,
//        UMaryland, 2002
//
//        MS in Software Engineering,
//        Johns Hopkins U, 2005
//
//        Experience
//        Software Developer II
//        Amtrak, June 2015 - Present
//        Duties: Gaudeamos Igitur Iuvenes Dum Somos
//
//        Software Developer I
//        Amtrak, June 2014 - June 2015
//        Duties: Gaudeamos Igitur Iuvenes Dum Somos
//
//        Business Analyst
//        DCPS, August 2005 - May 2014
//        Duties: Gaudeamos Igitur Iuvenes Dum Somos
//
//        Skills
//        PHP, highly skilled
//        Ruby on Rails, proficient
//        Perl, familiar













