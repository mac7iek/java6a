public class Student {

    private String Name;
    private int Age;
    private String Date;

    public Student(String name, int age, String date) {
        this.Name = name;
        this.Age = age;
        this.Date = date;
    }

    public String GetName() { return Name; }
    public int GetAge() { return Age; }
    public String GetDate() { return Date; }

    public String ToString() {
        return Name + " " + Age + " " + Date;
    }

    public static Student Parse(String str) {
        String[] data = str.split(" ");
        if (data.length != 3)
            return new Student("Parse Error", -1, "");
        try {
            return new Student(data[0], Integer.parseInt(data[1]), data[2]);
        } catch (NumberFormatException e) {
            return new Student("Parse Error", -1, "");
        }
    }
}