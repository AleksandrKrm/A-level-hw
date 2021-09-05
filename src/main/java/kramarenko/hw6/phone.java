package kramarenko.hw6;

public class phone {

        String number;
        String model;
        double weight;

        @Override
        public String toString() {
            return "Phone{" +
                    "number='" + number + '\'' +
                    ", model='" + model + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        public phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        public phone() {
        }

        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        public String getNumber() {
            return number;
        }
    }


