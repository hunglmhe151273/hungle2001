
import model.ListDoctors;
import model.Validation;
import model.view;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListDoctors list = new ListDoctors();
        view.menu();
        while (true) {
            int option = Validation.getInt(1, 9, "Choose option [1-8], [9] to Stop");
            if (option == 9) {
                break;
            } else {
                switch (option) {
                    case 1: list.innitData(); break;
                    case 2: list.editADoctorInfo();break;
                    case 3: list.deleteDoctor();break;
                    case 4: list.SearchById();break;
                    case 5: list.SearchByName();break;
                    case 6: list.SortByDateOfBirth();break;
                    case 7: list.displayListDoctor();break;
                    case 8: list.addDoctor();
                }
            }
        }

    }

}
