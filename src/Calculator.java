class Calculator {

    double add(double a, double b){
        return a + b;
    }

    double add(double a, double b, double c){
        return add(a,b) + c;
    }
    double sub(double a, double b){
        return a - b;
    }
    double sub(double a, double b, double c){
        return sub(a,b) - c;
    }
}
