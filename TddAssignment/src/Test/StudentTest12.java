package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Code.Student;

class StudentTest12 {

	@Test
	void test() throws CloneNotSupportedException {
		Student s=new Student(1,"Shrikant ");
		Student s1=(Student)s.clone();
		assertEquals(true,Student.checkClone(s, s1));
	}

	
	}