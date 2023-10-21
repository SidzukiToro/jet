package org.example;

public class Main {
    public static void main(String[] args) {
        String envVariableName = "OS";

        String envVariableValue = System.getenv(envVariableName);

        if (envVariableValue != null) {
            System.out.println("Значение переменной " + envVariableName + ": " + envVariableValue);
        } else {
            System.out.println("Переменная " + envVariableName + " не определена в окружении.");
        }
    }
}
