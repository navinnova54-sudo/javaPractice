class CPU {
    void display() {
        System.out.println("Intel CPU");
    }
}

class Computer {
    CPU cpu = new CPU();

    public static void main(String[] args) {
        Computer c = new Computer();
        c.cpu.display();
    }
}