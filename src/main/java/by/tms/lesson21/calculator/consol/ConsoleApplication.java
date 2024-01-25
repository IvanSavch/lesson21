package by.tms.lesson21.calculator.consol;

import by.tms.lesson21.calculator.model.Operation;
import by.tms.lesson21.calculator.service.OperationService;

public class ConsoleApplication {
    private final OperationService operationService = new OperationService();
    private final ConsoleWriter writer = new ConsoleWriter();
    private final ConsoleReader reader = new ConsoleReader();
    public void run() {
        writer.writer("you want to start yes/no ?");
        if (reader.readOperationType().equals("yes")) {
            while (true) {
                writer.writer("Enter num1");
                double num1 = reader.readNum();
                writer.writer("Enter num2");
                double num2 = reader.readNum();
                writer.writer("Enter operation");
                String type = reader.readOperationType();
                Operation operation = new Operation(num1, num2, type);
                operationService.calculate(operation);
                writer.writer("Result: " + operation.getResult());
                writer.writer("you want to continue yes/no ?");
                if (reader.readOperationType().equals("no")){
                    break;
                }
            }
        }
    }
}
