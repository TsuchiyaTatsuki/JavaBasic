package practice14.common;

public class DBCourse implements practice14.common.Course{

	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}
	public String[] getCourseUnit() {
		String[] getCourseUnits = {"DB基礎" , "SQL基礎" , "SQL基礎" , "SQL応用"};
		return getCourseUnits;

	}

}
