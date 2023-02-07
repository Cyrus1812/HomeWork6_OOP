package HomeWork6_OOP.Service.impls;

import HomeWork6_OOP.Model.MathResult;

public interface View {
    void showMathResult(MathResult result);
    Integer enteringNumbers();
    int showMenu();
}