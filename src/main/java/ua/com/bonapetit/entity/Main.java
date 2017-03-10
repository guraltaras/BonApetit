package ua.com.bonapetit.entity;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Main {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				EntityManagerFactory factory  = 
				Persistence.createEntityManagerFactory("primary");//абрика для створення манаджера який буде працювати з БД , 
				//primary - одиниця налаштувань (параметр одиниці лаштування БД  файлу presisstance.xml
		EntityManager manager = factory.createEntityManager();//		
		manager.getTransaction().begin();//коміт завершує транзакцію, всі операції над БД слід писати до comit
		
		
//	
//		manager.persist(new Color("White"));
//		manager.persist(new Color("Black"));
//		manager.persist(new Color("Space Gray"));
//		
		
		manager.getTransaction().commit();//
		manager.close();
		
		factory.close();
		
		
	}

}






/*
manager.persist(new Brend ("Apple"));
manager.persist(new Brend ("Samsung"));
manager.persist(new Brend ("HTC"));
manager.persist(new Brend ("Nokia"));
manager.persist(new Brend ("Huawei"));
manager.persist(new Brend ("Asus"));
manager.persist(new Brend ("MSI"));
manager.persist(new Brend ("HP"));
manager.persist(new Brend ("Dell"));
manager.persist(new Brend ("Lenovo"));
manager.persist(new Brend ("Sony"));
manager.persist(new Brend ("Mac"));

//color table

manager.persist(new Color ("White"));
manager.persist(new Color ("Black"));
manager.persist(new Color ("Red"));
manager.persist(new Color ("Blue"));
manager.persist(new Color ("Gray"));
manager.persist(new Color ("Green"));
manager.persist(new Color ("Space Gray"));
manager.persist(new Color ("Metalik"));
manager.persist(new Color ("Gold"));


//заповнюємо таблицю Os

manager.persist(new Os ("Android"));
manager.persist(new Os ("IOS"));
manager.persist(new Os ("MacOS"));
manager.persist(new Os ("Windos"));
manager.persist(new Os ("Linux"));

//заповнюємо таблицю Memory

manager.persist(new Ram (512, "Mb"));
manager.persist(new Ram (1024,"Mb / 1 Gb"));
manager.persist(new Ram (2048,"Mb / 2 Gb"));
manager.persist(new Ram (4096,"Mb / 4 Gb"));
manager.persist(new Ram (8192,"Mb / 8 Gb"));
manager.persist(new Ram (16384,"Mb / 10 Gb"));
manager.persist(new Ram (32768,"Gb / 12 Gb"));


//заповнюємо таблицю Drives


manager.persist(new Drives  (500 , TypeofHard.HDD));
manager.persist(new Drives (256,TypeofHard.SSD));
manager.persist(new Drives  (500 , TypeofHard.HDD));
manager.persist(new Drives (256,TypeofHard.SSD));
manager.persist(new Drives  (500 , TypeofHard.HDD));
manager.persist(new Drives  (500 , TypeofHard.HDD));
*/





//заповнюємо таблицю Телефонів
/*	
	manager.persist(new Phones  (1,"iPhone 5S", 350 ));
	manager.persist(new Phones  (1,"iPhone 5S", 350 ));
	manager.persist(new Phones  (1,"iPhone 6",  400 ));
	manager.persist(new Phones  (1,"iPhone 6S", 450 ));//видалити таблицю телефонів і заповнити по новій
	manager.persist(new Phones  (1,"iPhone 7",  600 ));

	manager.persist(new Phones  (2,"Note 3", 223 ));
	manager.persist(new Phones  (2,"A5", 299 ));
	manager.persist(new Phones  (2,"S7 Age", 600 ));

	manager.persist(new Phones  (3,"One", 469 ));
	manager.persist(new Phones  (4,"Zet", 220 ));
	manager.persist(new Phones  (5,"Honor 2", 180 ));
	manager.persist(new Phones  (5,"GR5", 200 ));


//заповнюємо таблицю Брендів (шв генеруэться автоматично )
	manager.persist(new Brend ("Apple"));
	manager.persist(new Brend ("Samsung"));
	manager.persist(new Brend ("HTC"));
	manager.persist(new Brend ("Nokia"));
	manager.persist(new Brend ("Huawei"));
	manager.persist(new Brend ("Asus"));
	manager.persist(new Brend ("MSI"));
	manager.persist(new Brend ("HP"));
	manager.persist(new Brend ("Dell"));
	manager.persist(new Brend ("Lenovo"));
	manager.persist(new Brend ("Sony"));
	manager.persist(new Brend ("Mac"));

//color table

	manager.persist(new Color ("White"));
	manager.persist(new Color ("Black"));
	manager.persist(new Color ("Red"));
	manager.persist(new Color ("Blue"));
	manager.persist(new Color ("Gray"));
	manager.persist(new Color ("Green"));
	manager.persist(new Color ("Space Gray"));
	manager.persist(new Color ("Metalik"));
	manager.persist(new Color ("Gold"));


//заповнюємо таблицю Os

	manager.persist(new Os ("Android"));
	manager.persist(new Os ("IOS"));
	manager.persist(new Os ("MacOS"));
	manager.persist(new Os ("Windos"));
	manager.persist(new Os ("Linux"));

//заповнюємо таблицю Memory


	manager.persist(new Memory (512, "Mb"));
	manager.persist(new Memory (1024,"Mb / 1 Gb"));
	manager.persist(new Memory (2048,"Mb / 2 Gb"));
	manager.persist(new Memory (4096,"Mb / 4 Gb"));
	manager.persist(new Memory (8192,"Mb / 8 Gb"));
	manager.persist(new Memory (16384,"Mb / 10 Gb"));
	manager.persist(new Memory (32768,"Gb / 12 Gb"));




//заповнюємо таблицю Computers

 Brend | idBrend | Model | Price
	manager.persist(new Computers ( 6 , "512 Rog", 1200));
manager.persist(new Computers ( 6 , "712 Rog", 1500));
manager.persist(new Computers ( 6 , "912 Rog", 1800));
manager.persist(new Computers ( 9 , "Inspirion 7000", 1056));
manager.persist(new Computers ( 9 , "Inspirion 9000", 2400));
manager.persist(new Computers ( 10 , "Idea Pad-10", 450));
manager.persist(new Computers ( 10 , "Idea Pad-110 ", 320));
manager.persist(new Computers ( 10 , "Pad-09", 530));
manager.persist(new Computers ( 10 , "Idea Pad 320", 600));
manager.persist(new Computers ( 10 , "Y-512", 700));
manager.persist(new Computers ( 10 , "Y-712", 900));
manager.persist(new Computers ( 8 , "250 G5", 160));
manager.persist(new Computers ( 8 , "Pro Book 430 G3", 700));
manager.persist(new Computers (8 , "Pro Book 450 G4 ", 880));
manager.persist(new Computers ( 8 , "Pavilion 15", 521));
manager.persist(new Computers ( 8 , "Pavilion 17", 620));
manager.persist(new Computers (8 , "Pavilion 790", 1100));
manager.persist(new Computers ( 7 , "GE6I", 2200));
manager.persist(new Computers ( 7 , "GR80", 3000));
manager.persist(new Computers ( 1 , "Mac Book Air 13", 1150));
manager.persist(new Computers ( 1 , "Mac Book Air 15", 1390));
manager.persist(new Computers ( 1 , "Mac Book 12", 1900));
manager.persist(new Computers ( 1 , "Mac Book 17 Pro ", 2600));
manager.persist(new Computers ( 1 , "Mac Book 901Ae67", 3400));



//table Android
manager.persist(new Android ("Android 1.0 <Apple Pie>"));
manager.persist(new Android ("Android 1.1 <Banana Bread>"));
manager.persist(new Android ("Android 1.5 <Cake>"));
manager.persist(new Android ("Android 1.6 <Donut>"));
manager.persist(new Android ("Android 2.0/2.1 <Eclair>"));
manager.persist(new Android ("Android 2.2 <Froyo>"));
manager.persist(new Android ("Android 2.3 <Gingerbread"));
manager.persist(new Android ("Android 3.x <Honeycomb>"));
manager.persist(new Android ("Android 4.0 <Ice Cream Sandwich>"));
manager.persist(new Android ("Android 4.4 <KitKat>"));
manager.persist(new Android ("Android 5.0/5.1 <Lolipop>"));
manager.persist(new Android ("Android 6.0 <Marshmallow>"));
manager.persist(new Android ("Android 7.0 <Nougat>"));



//table IOSsystem
manager.persist(new iossystem("IOS 3.1.3"));
manager.persist(new iossystem("IOS 4.2.1"));
manager.persist(new iossystem("IOS 5.1.1"));
manager.persist(new iossystem("IOS 6.1.6"));
manager.persist(new iossystem("IOS 7.1.2"));
manager.persist(new iossystem("IOS 9.3.5"));
manager.persist(new iossystem("IOS 10.2"));


//table Windows
manager.persist(new Windows ("Windows XP 64-bit Edition"));
manager.persist(new Windows ("Windows Server 2003"));
manager.persist(new Windows ("Windows XP Professional 64-bit Edition"));
manager.persist(new Windows ("Windows Vista"));
manager.persist(new Windows ("Windows Home Server "));
manager.persist(new Windows ("Windows Server 2008"));
manager.persist(new Windows ("Windows 7"));
manager.persist(new Windows ("Windows 7 Home"));
manager.persist(new Windows ("Windows 7 Professional"));
manager.persist(new Windows ("Windows 8"));
manager.persist(new Windows ("Windows 8.1"));
manager.persist(new Windows ("Windows Server 2012 R2"));
manager.persist(new Windows ("Windows 10"));




//table linux
manager.persist(new Linux ("Ubuntu 6.10 <Edgy Eft>"));
manager.persist(new Linux ("Ubuntu 7.04 <Feisty Fawn>"));
manager.persist(new Linux ("Ubuntu 7.10 <Gutsy Gibbon>"));
manager.persist(new Linux ("Ubuntu 8.04 <Hardy Heron>"));
manager.persist(new Linux ("Ubuntu 8.10 <Intrepid Ibex>"));
manager.persist(new Linux ("Ubuntu 9.04 <Jaunty Jacklope>"));
manager.persist(new Linux ("Ubuntu 9.10 <Karmic Koala>"));
manager.persist(new Linux ("Ubuntu 10.04 <LTC>"));
manager.persist(new Linux ("Ubuntu 10.10 <Maverik Meerkat>"));




manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));
manager.persist(new Clients ("Mishel Ney ", 18 , "mishel,ney09@gmail.com", "absolut78902332"));

*/


//table Specifications_phone
//String OS | String Color | String CPU | double scream | double Camera | int RAM | int Memory
/*
manager.persist(new Spec_phone("Android", "Gold", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("Android", "White", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("Android", "White", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("IOS", "Gold", "Apple A 7 2-x 1.3 Hz" , 10.2 , 16.0 , 4 , 64));
manager.persist(new Spec_phone("IOS", "Space Gray", "Apple A9 4-x 2.0 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("Android", "Black", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("Android", "Gold", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("Android", "Metalic", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));
manager.persist(new Spec_phone("Android", "Gold", "MEdia Toch ME7 4-x 1.3 Hz" , 8.2 , 8.0 , 2 , 16));

*/

