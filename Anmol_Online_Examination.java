import java.util.Scanner;
class reg{
    Scanner sc=new Scanner(System.in);
    menu mm=new menu();
    void r1(){
        System.out.println("\nEnter your Name :");
        String name=sc.next();
        System.out.println("Enter your Mail :");
        String mail=sc.next();
        System.out.println("Enter your Password :");
        int pp=sc.nextInt();
        System.out.println("\n   Registarion Succesful !!");
        System.out.println("\n    --- Login ----");
        while(true){
            System.out.println("Enter your Mail");
            String s=sc.next();
            System.out.println("Enter your Password");
            int p=sc.nextInt();

            if(s.equals(mail) && p == pp){
                mm.m2();
                break;
            }
            else{
                System.out.println("You Entered Mail or Password are incorrect");
            }
        }

    }
}

class abt{
    void display(){
        System.out.println("Name : Anmol");
        System.out.println("Mail : anmol@gmail.com");
    }
}

class menu{
    sci scn=new sci();
    eng e=new eng();
    mat m=new mat();
    abt a=new abt();
    Scanner sc=new Scanner(System.in);
    public void m2(){
        System.out.println("\nlogin succesful");
        while(true){
            System.out.println("\n1.My Account\n2.Exam\n3.About\n4.Exit");
            System.out.println("\nEnter your option");
            int o=sc.nextInt();
            if(o == 1){
                a.display();
                System.out.println("\n1.Back            2.Exit");
                int g1=sc.nextInt();
                if(g1==1){
                    System.out.println("\n");
                }
                else{
                    break;
                }
            }
            else if(o == 2){
                System.out.println("\n1.Science\n2.English\n3.Maths");
                System.out.println("\nSelect the Subjct ");
                int su=sc.nextInt();
                if(su == 1){
                    scn.s1();
                }
                else if(su == 2){
                    e.e1();
                }
                else if(su == 3){
                    m.mat1();
                }
                else{
                    System.out.println("choose the correct one");
                }
                System.out.println("\n1.Back            2.Exit");
                int g2=sc.nextInt();
                if(g2==1){
                    System.out.println("\n");
                }
                else{
                    break;
                }
            }
            else if(o == 3){
                System.out.println("\n-- ANMOL Online Examination Portal --");
                System.out.println("\nDesigned by :\nAnmol Dubey ");
                System.out.println("\n1.Back            2.Exit");
                int g3=sc.nextInt();
                if(g3==1){
                    System.out.println("\n");
                }
                else{
                    break;
                }
            }
            else if(o == 4){
                break;
            }
            else{
                System.out.println("choose the correct one");
            }
        }
    }
}

class logA{
    Scanner sc=new Scanner(System.in);
    public void m1(){
        menu m=new menu();
        int pswd=1234;
        System.out.println("Enter your Mail");
        String s=sc.next();
        while(true){
            System.out.println("Enter your Password");
            int p=sc.nextInt();
            if(p == pswd){
                m.m2();
                break;
            }
            else{
                System.out.println("You Entered Mail or Password are incorrect");
            }
        }
    }
}

class sci{
    Scanner sc=new Scanner(System.in);
    void s1(){
        int count = 0;
        System.out.println("\nThere are 10 questions each question carries 2marks");
        System.out.println("\nQuestion No.1	 :");
        System.out.println("\nWho is the Father of our Nation ?");
        System.out.println("\n1.Mahatma Gandhi");
        System.out.println("2.Dr. Jawaharlal Nehru");
        System.out.println("3.Sardar Vallabhbhai Patel");
        System.out.println("4.Dr. B.R. Ambedkar\n");
        int u1=sc.nextInt();
        if(u1==1){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.2	 :");
        System.out.println("\nIndia celebrates it's National Sports on ?");
        System.out.println("\n1. 29 August");
        System.out.println("2. 30 August");
        System.out.println("3. 15 March");
        System.out.println("4. 25 December\n");
        int u2=sc.nextInt();
        if(u2==1){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.3	 :");
        System.out.println("\nIn OOPs Polymorphism refers to ?");
        System.out.println("\n1. one form");
        System.out.println("2. two form");
        System.out.println("3. many forms");
        System.out.println("4. Do not Know\n");
        int u3=sc.nextInt();
        if(u3==3){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.4	 :");
        System.out.println("\nMultiple Inheritance is possible in Java or not ?");
        System.out.println("\n1. Possible");
        System.out.println("2. Not Possible");
        System.out.println("3. Do not Know");
        System.out.println("4. Option 1\n");
        int u4=sc.nextInt();
        if(u4==2){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.5	 :");
        System.out.println("\nwhich element has a molecular formula of C6H6 ?");
        System.out.println("\n1. ethylene di-amine");
        System.out.println("2. benzene");
        System.out.println("3. methane");
        System.out.println("4. hexane\n");
        int u5=sc.nextInt();
        if(u5==2){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.6	 :");
        System.out.println("\nWhich shape has three sides ?");
        System.out.println("\n1.Square");
        System.out.println("2.Triangle");
        System.out.println("3.Circle");
        System.out.println("4.Rectangle\n");
        int u6=sc.nextInt();
        if(u6==2){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.7	 :");
        System.out.println("\nWhich of the following is National Animal of India?");
        System.out.println("\n1.Tiger");
        System.out.println("2.Lion");
        System.out.println("3.Rhinoceros");
        System.out.println("4.Elephant\n");
        int u7=sc.nextInt();
        if(u7==1){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.8	 :");
        System.out.println("\nArteries carries ______ blood ?");
        System.out.println("\n1. oxygenated blood");
        System.out.println("2. deoxygenated blood");
        System.out.println("3. oxygen-rich blood");
        System.out.println("4. both 1 & 3\n");
        int u8=sc.nextInt();
        if(u8==4){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.9	 :");
        System.out.println("\nwhat is h2O ?");
        System.out.println("\n1.water");
        System.out.println("2.methane");
        System.out.println("3.ethane");
        System.out.println("4. None of the above\n");
        int u9=sc.nextInt();
        if(u9==1){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.10	 :");
        System.out.println("\nWho is the first female Prime Minister of India ?");
        System.out.println("\n1. Sushma Swaraj");
        System.out.println("2. Nirmala Sittaraman");
        System.out.println("3. Sarogini Naidu");
        System.out.println("4. Indira Gandhi\n");
        int u10=sc.nextInt();
        if(u10==4){
            count++;
        }
        else{
            count=count;
        }
        if(count > 8){
            System.out.println("\nYour performance is too good..");
        }
        else if(count > 4 && count <9){
            System.out.println("\nYour performance is not so bad. All the best for next time !");
        }
        else{
            System.out.println("\nYour performance is too bad !!");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Your total Score is :"+count*2);
        System.out.println("--------------------------------------");
        System.out.println("\nNo.of questions you did correct are :"+count);
        System.out.println("\nSummary of Your Exam");
        System.out.println("\nQ1.Your Option   :"+u1+"\n   Actual Option :1\nQ2.Your Option   :"+u2+"\n   Actual Option :1\nQ3.Your Option   :"+u3+"\n   Actual Option :3\nQ4.Your Option   :"+u4+"\n   Actual Option :2\nQ5.Your Option   :"+u5+"\n   Actual Option :2\nQ6.Your Option   :"+u6+"\n   Actual Option :2\nQ7.Your Option   :"+u7+"\n   Actual Option :1\nQ8.Your Option   :"+u8+"\n   Actual Option :4\nQ9.Your Option   :"+u9+"\n   Actual Option :1\nQ10.Your Option  :"+u10+"\n   Actual Option :4");
    }
}

class eng{
    Scanner sc=new Scanner(System.in);
    void e1(){
        int count = 0;
        System.out.println("\nThere are 10 questions each question carries 2marks");

        System.out.println("\nQuestion No.1	 :");
        System.out.println("\nThe weather has been........ ?");
        System.out.println("\n1.a lovely");
        System.out.println("2.the lovely");
        System.out.println("3.lovely");
        int u1=sc.nextInt();
        if(u1==3){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.2	 :");
        System.out.println("\nHow is the..........in Delhi ?");
        System.out.println("\n1.whether");
        System.out.println("2.weather");
        int u2=sc.nextInt();
        if(u2==2){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.3	 :");
        System.out.println("\nCan you...........me ?");
        System.out.println("\n1.here");
        System.out.println("2.hear");

        int u3=sc.nextInt();
        if(u3==2){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.4	 :");
        System.out.println("\nparomita has no siblings she is............child ?");
        System.out.println("\n1.a lonely");
        System.out.println("2.an only");
        System.out.println("3.only one");
        int u4=sc.nextInt();
        if(u4==2){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.5	 :");
        System.out.println("\nThe teacher and students share.........mutual trust ?");
        System.out.println("\n1.a deep");
        System.out.println("2.deep");
        System.out.println("3.deeply");

        int u5=sc.nextInt();
        if(u5==1){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.6	 :");
        System.out.println("\nShe has.......to start her driving lessons ?");
        System.out.println("\n1.yet");
        System.out.println("2.already");

        int u6=sc.nextInt();
        if(u6==2){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.7	 :");
        System.out.println("\nWhen tharun reached the auditorium they had.........left ?");
        System.out.println("\n1.already");
        System.out.println("2.yet");

        int u7=sc.nextInt();
        if(u7==1){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.8	 :");
        System.out.println("\nThe company needs someone with........... knowledge of the indian market ?");
        System.out.println("\n1.good");
        System.out.println("2.a good");
        System.out.println("3.the good");
        System.out.println("4.Heart\n");
        int u8=sc.nextInt();
        if(u8==2){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.9	 :");
        System.out.println("\nYou Know someone is pretending to be sad if they shed........tears ?");
        System.out.println("\n1.Baby's");
        System.out.println("2.Cat's");
        System.out.println("3.Crocodile's");

        int u9=sc.nextInt();
        if(u9==3){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.10	 :");
        System.out.println("\nif you are very busy, you are as busy as a.......... ?");
        System.out.println("\n1.bat");
        System.out.println("2.bee");
        System.out.println("3.beaver");
        System.out.println("4.butterfly\n");
        int u10=sc.nextInt();
        if(u10==3){
            count++;
        }
        else{
            count=count;
        }
        if(count > 8){
            System.out.println("\nYour performance is too good..");
        }
        else if(count > 4 && count <9){
            System.out.println("\nYour performance is not so bad. All the best for next time !");
        }
        else{
            System.out.println("\nYour performance is too bad !!");
        }

        System.out.println("\n--------------------------------------");
        System.out.println("Your total Score is :"+count*2);
        System.out.println("--------------------------------------");
        System.out.println("No.of questions you did correct are :"+count);
        System.out.println("\nSummary of Your Exam");
        System.out.println("\nQ1.Your Option   :"+u1+"\n   Actual Option :3\nQ2.Your Option   :"+u2+"\n   Actual Option :2\nQ3.Your Option   :"+u3+"\n   Actual Option :2\nQ4.Your Option   :"+u4+"\n   Actual Option :2\nQ5.Your Option   :"+u5+"\n   Actual Option :1\nQ6.Your Option   :"+u6+"\n   Actual Option :2\nQ7.Your Option   :"+u7+"\n   Actual Option :1\nQ8.Your Option   :"+u8+"\n   Actual Option :2\nQ9.Your Option   :"+u9+"\n   Actual Option :3\nQ10.Your Option  :"+u10+"\n   Actual Option :3");
    }
}

class mat{
    Scanner sc=new Scanner(System.in);
    void mat1(){
        int count = 0;
        System.out.println("\nThere are 10 questions each question carries 2marks");

        System.out.println("\nQuestion No.1	 :");
        System.out.println("\nWhat is the next prime number after 3 ?");
        System.out.println("\n1.6");
        System.out.println("2.5");
        System.out.println("3.9");
        System.out.println("4.7\n");
        int u1=sc.nextInt();
        if(u1==2){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.2	 :");
        System.out.println("\nWhat is 15-7 ?");
        System.out.println("\n1.10");
        System.out.println("2.2");
        System.out.println("3.12");
        System.out.println("4.8\n");
        int u2=sc.nextInt();
        if(u2==4){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.3	 :");
        System.out.println("\nWhat is the square root of 81 ?");
        System.out.println("\n1.9");
        System.out.println("2.10");
        System.out.println("3.7");
        System.out.println("4.6\n");
        int u3=sc.nextInt();
        if(u3==1){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.4	 :");
        System.out.println("\nWhat does the Roman Numerical (C) represent ?");
        System.out.println("\n1.one");
        System.out.println("2.One Lakh");
        System.out.println("3.One Thousand");
        System.out.println("4.One Hundred\n");
        int u4=sc.nextInt();
        if(u4==4){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.5	 :");
        System.out.println("\nWhat does century reprsent ?");
        System.out.println("\n1.100");
        System.out.println("2.50");
        System.out.println("3.200");
        System.out.println("4.25\n");
        int u5=sc.nextInt();
        if(u5==1){
            count++;
        }
        else{
            count=count;
        }

        System.out.println("\nQuestion No.6	 :");
        System.out.println("\nwhat is 25+24-10 ?");
        System.out.println("\n1.20");
        System.out.println("2.16");
        System.out.println("3.39");
        System.out.println("4.49\n");
        int u6=sc.nextInt();
        if(u6==3){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.7	 :");
        System.out.println("\nwhat comes next in Fibonacci sequence :0,1,1,2,3,5,8,13,.... ?");
        System.out.println("\n1.15");
        System.out.println("2.23");
        System.out.println("3.17");
        System.out.println("4.21\n");
        int u7=sc.nextInt();
        if(u7==4){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.8	 :");
        System.out.println("\nwhich is greter -50 or 2 ?");
        System.out.println("\n1.both");
        System.out.println("2.none");
        System.out.println("3.-50");
        System.out.println("4.2\n");
        int u8=sc.nextInt();
        if(u8==4){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.9	 :");
        System.out.println("\nwhich is greter -50 or -25 ?");
        System.out.println("\n1.-50");
        System.out.println("2.none");
        System.out.println("3.-25");
        System.out.println("4.both\n");
        int u9=sc.nextInt();
        if(u9==3){
            count++;
        }
        else{
            count=count;
        }
        System.out.println("\nQuestion No.10	 :");
        System.out.println("\nSimplify 20+2*4-1*28 ?");
        System.out.println("\n1.16");
        System.out.println("2.324");
        System.out.println("3.28");
        System.out.println("4.0\n");
        int u10=sc.nextInt();
        if(u10==4){
            count++;
        }
        else{
            count=count;
        }
        if(count > 8){
            System.out.println("\nYour performance is too good..");
        }
        else if(count > 4 && count <9){
            System.out.println("\nYour performance is not so bad. All the best for next time !");
        }
        else{
            System.out.println("\nYour performance is too bad !!");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Your total Score is :"+count*2);
        System.out.println("--------------------------------------");
        System.out.println("No.of questions you did correct are :"+count);
        System.out.println("\nSummary of Your Exam");
        System.out.println("\nQ1.Your Option   :"+u1+"\n   Actual Option :2\nQ2.Your Option   :"+u2+"\n   Actual Option :4\nQ3.Your Option   :"+u3+"\n   Actual Option :1\nQ4.Your Option   :"+u4+"\n   Actual Option :4\nQ5.Your Option   :"+u5+"\n   Actual Option :1\nQ6.Your Option   :"+u6+"\n   Actual Option :3\nQ7.Your Option   :"+u7+"\n   Actual Option :4\nQ8.Your Option   :"+u8+"\n   Actual Option :4\nQ9.Your Option   :"+u9+"\n   Actual Option :3\nQ10.Your Option  :"+u10+"\n   Actual Option :4");
    }
}

class online{
    public static void main(String []args){
        logA l1=new logA();
        reg rr=new reg();

        Scanner sc=new Scanner(System.in);
        System.out.println("\nWelcome to ANMOL Online Examination Portal !!");
        System.out.println("\n1.Login\n2.SignUp");
        System.out.println("\nEnter your option ");
        int r=sc.nextInt();
        if(r == 1){
            System.out.println("\nWelcome Come back");
            System.out.println("\n    --- Login ----");
            l1.m1();

        }
        else{
            System.out.println("\n    --- SignUp ----");
            rr.r1();


        }
    }
}
