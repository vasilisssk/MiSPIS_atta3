public class Main {
    public static void main(String[] args) {

        // экземпляры
        Department physicsDepartment = new Department("Теоретическая физика", "ФИЗ");
        Lecturer lecturer = new Lecturer();
        DepartmentHead head = new DepartmentHead();

        // сеттеры
        lecturer.setName("Иван");
        head.setName("Николай");

        lecturer.setDepartment(physicsDepartment);
        head.setHeadsDepartment(physicsDepartment);

        // инфа
        System.out.println("Унив. система:");
        System.out.println("Препод: " + lecturer.getName());
        System.out.println("Кафедра: " + physicsDepartment.getName());
        System.out.println("Заведующий кафедрой: " + head.getName());

        if (lecturer.getDepartment() != null) {
            System.out.println("Преподаватель работает на кафедре: " +
                    lecturer.getDepartment().getName());
        }

        System.out.println("\nДоп. инфа");

        if (head.getHeadsDepartment() != null) {
            System.out.println(head.getName() + " заведует кафедрой: " +
                    head.getHeadsDepartment().getName());
        }
    }
}