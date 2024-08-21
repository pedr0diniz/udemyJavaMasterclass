package sec7ooppart1inheritance.sec798stringmanipulationmethods;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";

        int startingfIndex = birthDate.indexOf("1982");
        System.out.println("Starting index = " + startingfIndex);
        System.out.println("Birth year = " + birthDate.substring(startingfIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println(newDate); // 25/11/1982

        // avoid this kind of code, very inefficient
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate); // newDate = 25/11/1982

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate); // newDate = 25/11/1982

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate); // newDate = 25/11/1982

        System.out.println("newDate = " + newDate.replace('/', '-')); // newDate = 25-11-1982

        System.out.println("newDate = " + newDate.replace("2", "00"));

        // below methods use regex strings, replace uses just strings
        System.out.println("newDate = " + newDate.replaceFirst("/", "-")); // newDate = 25-11/1982
        System.out.println("newDate = " + newDate.replaceAll("/", "---")); // newDate = 25---11---1982

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
