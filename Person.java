package PersonOOPWOW;

public class Person {
        String name;
        int schoolYear;
        double mpw;
    
        Person(String name, int schoolYear, double mpw) {
            this.name = name;
            this.schoolYear = schoolYear;
            this.mpw = mpw;
        }
    
        boolean likelyToAttend() {
            return !(this.schoolYear > 12 || this.schoolYear < 9 || this.mpw < 1.0) {
        public static void main(String[] args) {
            Person joseph = new Person("Joseph", 10, 0.5);
            Person zhiming = new Person("zhiming", 21, 9.9);
            Person tracey = new Person ("tracey", 10, 1.16);
            Person alice = new Person("stranger", 1, 0.1);
            Person ben = new Person("keobkeig", -1, -1.10);
            System.out.println(joseph.likelyToAttend());
            System.out.println(zhiming.likelyToAttend());
            System.out.println(tracey.likelyToAttend());
            System.out.println(alice.likelyToAttend());
            System.out.println(ben.likelyToAttend());
        }
    }
    
