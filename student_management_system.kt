// Student class to represent a student's information
class Student(val name: String, val age: Int, val grade: String)

// StudentManager class to manage a list of students
class StudentManager {
    private val students = mutableListOf<Student>()
    
    fun addStudent(student: Student) {
        students.add(student)
    }
    
    fun getStudents(): List<Student> = students

    fun findStudentByName(name: String): Student? {
        return students.find { it.name == name }
    }
}

fun main() {
    val studentManager = StudentManager()

    // Adding students to the list
    studentManager.addStudent(Student("Alice", 20, "A"))
    studentManager.addStudent(Student("Bob", 22, "B"))
    studentManager.addStudent(Student("Charlie", 21, "A"))

    // Retrieving and displaying all students
    val students = studentManager.getStudents()
    for (student in students) {
        println("Name: ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
    }

    // Finding a student by name
    val student = studentManager.findStudentByName("Bob")
    student?.let {
        println("Found student: Name: ${it.name}, Age: ${it.age}, Grade: ${it.grade}")
    }
}
