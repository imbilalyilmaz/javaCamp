package odev;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1,"Kurslar�m");
		Category category2 = new Category(2,"T�m Kurslar�m");
		Category category3 = new Category(3,"Kampa Haz�rl�k");
		Category category4 = new Category(4,"SSS");
		
		Category[] categories = {
				category1,
				category2,
				category3,
				category4
		};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		System.out.println("-------------------------------");
		
		Course course1 = new Course();
		course1.name = "C#";
		course1.id = 1;
		course1.coursePrice = 0;
		course1.instructor = "Engin Demiro�";
		
		Course course2 = new Course();
		course2.name = "Java";
		course2.id = 2;
		course2.coursePrice = 0;
		course2.instructor = "Engin Demiro�";
		
		Course course3 = new Course();
		course3.name = "Programlamaya Giri�";
		course3.id = 3;
		course3.coursePrice = 0;
		course3.instructor = "Engin Demiro�";
		
		Course[] courses = {
				course1,
				course2,
				course3,
		};
		
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			System.out.println("Kurs: " + course.name);
			System.out.println("Fiyat: " + course.coursePrice);
			System.out.println("E�itmen: " + course.instructor);
			courseManager.goToCourse(course);
			System.out.println("--------------");
		}
		

	}

}
