package com.example.quizappnormalgfg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView qnTV, qnNoTV;
    private Button b1, b2, b3, b4;

    private ArrayList<Quiz> quizArr;

    Random random;
    int currentScore = 0, qnAttempted = 1, currentpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qnTV = findViewById(R.id.tvQn);
        qnNoTV = findViewById(R.id.idTVQnAtmptd);
        b1 = findViewById(R.id.btnoption1);
        b2 = findViewById(R.id.btnoption2);
        b3 = findViewById(R.id.btnoption3);
        b4 = findViewById(R.id.btnoption4);
        quizArr = new ArrayList<>();
        random = new Random();

        getQuizQn(quizArr);

        currentpos = random.nextInt(quizArr.size());
        setDataToViews(currentpos);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArr.get(currentpos).getAnswer().trim().toLowerCase().equals(b1.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                qnAttempted++;
                currentpos = random.nextInt(quizArr.size());
                setDataToViews(currentpos);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArr.get(currentpos).getAnswer().trim().toLowerCase().equals(b2.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                qnAttempted++;
                currentpos = random.nextInt(quizArr.size());
                setDataToViews(currentpos);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArr.get(currentpos).getAnswer().trim().toLowerCase().equals(b3.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                qnAttempted++;
                currentpos = random.nextInt(quizArr.size());
                setDataToViews(currentpos);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArr.get(currentpos).getAnswer().trim().toLowerCase().equals(b4.getText().toString().trim().toLowerCase())){
                    currentScore++;
                }
                qnAttempted++;
                currentpos = random.nextInt(quizArr.size());
                setDataToViews(currentpos);
            }
        });
    }

    private void getQuizQn(ArrayList<Quiz> quizArr) {
        quizArr.add(new Quiz("What is an interface in Java?",
                "An interface is a blueprint of a class.",
                "An interface defines the methods that a class must implement.",
                "An interface cannot be instantiated.",
                "The correct answer is: An interface is a blueprint of a class."
                , "An interface is a blueprint of a class."
        ));
        quizArr.add(new Quiz("What is an abstract class in Java?",
                "An abstract class is a class that cannot be instantiated.",
                "An abstract class can have abstract methods and concrete methods.",
                "An abstract method is a method that is declared but not implemented.",
                "The correct answer is: An abstract class is a class that cannot be instantiated."
                , "An abstract class is a class that cannot be instantiated."
        ));
        quizArr.add(new Quiz("What is an enum in Java?",
                "An enum is a special data type that represents a fixed set of values.",
                "The values of an enum are called enum constants.",
                "An enum can be used to represent a set of states, such as the states of a light bulb.",
                "The correct answer is: An enum is a special data type that represents a fixed set of values."
                , "An enum is a special data type that represents a fixed set of values."
        ));
        quizArr.add(new Quiz("What is the chemical symbol for gold?",
                "Go",
                "Ag",
                "Au",
                "Agl",
                "Au"
        ));

        quizArr.add(new Quiz("What is the smallest prime number?",
                "0",
                "1",
                "2",
                "3",
                "2"
        ));

        quizArr.add(new Quiz("What is the formula for the area of a circle?",
                "A = πr^2",
                "A = 2πr",
                "A = 2r^2",
                "A = 4πr",
                "A = πr^2"
        ));

        quizArr.add(new Quiz("Which gas is most abundant in Earth's atmosphere?",
                "Oxygen",
                "Carbon dioxide",
                "Nitrogen",
                "Hydrogen",
                "Nitrogen"
        ));

        quizArr.add(new Quiz("What is the chemical formula for water?",
                "H2O2",
                "CO2",
                "H2O",
                "O2",
                "H2O"
        ));

        quizArr.add(new Quiz("What is the speed of light in a vacuum?",
                "299,792,458 meters per second",
                "100,000 meters per second",
                "3,000,000 meters per second",
                "186,282 miles per second",
                "299,792,458 meters per second"
        ));

        quizArr.add(new Quiz("What is the chemical symbol for iron?",
                "Fe",
                "Ir",
                "In",
                "Io",
                "Fe"
        ));

        quizArr.add(new Quiz("What is the formula for Newton's second law of motion?",
                "F = ma",
                "E = mc^2",
                "F = mg",
                "P = mv",
                "F = ma"
        ));

        quizArr.add(new Quiz("What is the largest planet in our solar system?",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Jupiter"
        ));

        quizArr.add(new Quiz("What is the chemical symbol for carbon?",
                "Cr",
                "Co",
                "Ca",
                "C",
                "C"
        ));

        quizArr.add(new Quiz("What is the formula for the circumference of a circle?",
                "C = πd",
                "C = 2πr",
                "C = 2r",
                "C = 4πr",
                "C = 2πr"
        ));

        quizArr.add(new Quiz("Which planet is known as the 'Red Planet'?",
                "Earth",
                "Mars",
                "Venus",
                "Mercury",
                "Mars"
        ));

        quizArr.add(new Quiz("What is the chemical symbol for sodium?",
                "So",
                "Sd",
                "Na",
                "N",
                "Na"
        ));

        quizArr.add(new Quiz("What is the formula for the Pythagorean theorem?",
                "a^2 + b^2 = c^2",
                "a^2 - b^2 = c^2",
                "a^2 + b = c",
                "a + b = c^2",
                "a^2 + b^2 = c^2"
        ));

        quizArr.add(new Quiz("What is the acceleration due to gravity on the surface of Earth?",
                "1 m/s^2",
                "9.8 m/s^2",
                "19.6 m/s^2",
                "5.2 m/s^2",
                "9.8 m/s^2"
        ));

        quizArr.add(new Quiz("What is the chemical symbol for helium?",
                "Hl",
                "He",
                "H",
                "He2",
                "He"
        ));

        quizArr.add(new Quiz("What is the formula for the volume of a cube?",
                "V = l^2",
                "V = l^3",
                "V = 2l",
                "V = 4l",
                "V = l^3"
        ));

        quizArr.add(new Quiz("Who formulated the theory of relativity?",
                "Isaac Newton",
                "Albert Einstein",
                "Galileo Galilei",
                "Stephen Hawking",
                "Albert Einstein"
        ));

        quizArr.add(new Quiz("What is the chemical symbol for oxygen?",
                "O2",
                "Ox",
                "O",
                "Oz",
                "O"
        ));

        quizArr.add(new Quiz("What is the square root of 144?",
                "12",
                "10",
                "14",
                "16",
                "12"
        ));

            quizArr.add(new Quiz("What is an operating system?",
                    "Software that manages computer hardware",
                    "A type of computer hardware",
                    "An application program",
                    "None of the above",
                    "Software that manages computer hardware"
            ));

            quizArr.add(new Quiz("Which scheduling algorithm uses priority levels to determine the order of process execution?",
                    "First-Come, First-Served (FCFS)",
                    "Round Robin",
                    "Priority Scheduling",
                    "Shortest Job Next (SJN)",
                    "Priority Scheduling"
            ));

            quizArr.add(new Quiz("What is the main purpose of an operating system's kernel?",
                    "To manage memory and storage",
                    "To provide a user-friendly interface",
                    "To run applications",
                    "To display graphical user interfaces (GUIs)",
                    "To manage memory and storage"
            ));

            quizArr.add(new Quiz("What is a regular language in the theory of automata?",
                    "A language that can be recognized by a finite automaton",
                    "A language that can be recognized by a pushdown automaton",
                    "A language that can be recognized by a Turing machine",
                    "A language that cannot be recognized by any automaton",
                    "A language that can be recognized by a finite automaton"
            ));

            quizArr.add(new Quiz("In the context of data structures, what does FIFO stand for?",
                    "First In, First Out",
                    "First Input, First Output",
                    "Fast Input, Fast Output",
                    "Fixed Input, Fixed Output",
                    "First In, First Out"
            ));

            quizArr.add(new Quiz("Which data structure uses a Last-In-First-Out (LIFO) approach?",
                    "Queue",
                    "Stack",
                    "Linked List",
                    "Tree",
                    "Stack"
            ));

            quizArr.add(new Quiz("What is the time complexity of binary search in a sorted array?",
                    "O(1)",
                    "O(n)",
                    "O(log n)",
                    "O(n^2)",
                    "O(log n)"
            ));

            quizArr.add(new Quiz("Which layer of the OSI model is responsible for routing and addressing in computer networks?",
                    "Physical Layer",
                    "Data Link Layer",
                    "Network Layer",
                    "Transport Layer",
                    "Network Layer"
            ));

            quizArr.add(new Quiz("What is the purpose of DNS (Domain Name System) in computer networks?",
                    "To encrypt data transmission",
                    "To map domain names to IP addresses",
                    "To establish secure connections",
                    "To compress data",
                    "To map domain names to IP addresses"
            ));

            quizArr.add(new Quiz("Which data structure is used to organize data in a hierarchical tree-like structure?",
                    "Stack",
                    "Queue",
                    "Graph",
                    "Tree",
                    "Tree"
            ));

            quizArr.add(new Quiz("What is the primary goal of an operating system's file management system?",
                    "To create files",
                    "To delete files",
                    "To organize and control access to files and directories",
                    "To format storage devices",
                    "To organize and control access to files and directories"
            ));

            quizArr.add(new Quiz("Which algorithm is used for finding the shortest path in a weighted graph?",
                    "Depth-First Search (DFS)",
                    "Breadth-First Search (BFS)",
                    "Dijkstra's Algorithm",
                    "Kruskal's Algorithm",
                    "Dijkstra's Algorithm"
            ));

            quizArr.add(new Quiz("What is the Turing machine in the theory of automata?",
                    "A finite automaton",
                    "A machine with an infinite tape and a finite set of rules",
                    "A machine with multiple tapes",
                    "A machine that can recognize context-free languages",
                    "A machine with an infinite tape and a finite set of rules"
            ));

            quizArr.add(new Quiz("Which sorting algorithm has the best average and worst-case time complexity?",
                    "Bubble Sort",
                    "Quick Sort",
                    "Selection Sort",
                    "Merge Sort",
                    "Merge Sort"
            ));

            quizArr.add(new Quiz("What is the purpose of the Transport Layer in the OSI model?",
                    "To physically transmit data",
                    "To establish and manage network connections",
                    "To provide error detection and correction",
                    "To ensure data integrity and end-to-end communication",
                    "To ensure data integrity and end-to-end communication"
            ));

            quizArr.add(new Quiz("In computer networks, what is the role of a router?",
                    "To connect devices within a LAN (Local Area Network)",
                    "To transmit data over the internet",
                    "To manage file storage",
                    "To print documents",
                    "To transmit data over the internet"
            ));

            quizArr.add(new Quiz("What is an operating system?",
                    "Software that manages computer hardware",
                    "A type of computer hardware",
                    "An application program",
                    "None of the above",
                    "Software that manages computer hardware"
            ));

            quizArr.add(new Quiz("Which scheduling algorithm uses priority levels to determine the order of process execution?",
                    "First-Come, First-Served (FCFS)",
                    "Round Robin",
                    "Priority Scheduling",
                    "Shortest Job Next (SJN)",
                    "Priority Scheduling"
            ));

            quizArr.add(new Quiz("What is the main purpose of an operating system's kernel?",
                    "To manage memory and storage",
                    "To provide a user-friendly interface",
                    "To run applications",
                    "To display graphical user interfaces (GUIs)",
                    "To manage memory and storage"
            ));

            quizArr.add(new Quiz("What is a regular language in the theory of automata?",
                    "A language that can be recognized by a finite automaton",
                    "A language that can be recognized by a pushdown automaton",
                    "A language that can be recognized by a Turing machine",
                    "A language that cannot be recognized by any automaton",
                    "A language that can be recognized by a finite automaton"
            ));

            quizArr.add(new Quiz("In the context of data structures, what does FIFO stand for?",
                    "First In, First Out",
                    "First Input, First Output",
                    "Fast Input, Fast Output",
                    "Fixed Input, Fixed Output",
                    "First In, First Out"
            ));

            quizArr.add(new Quiz("Which data structure uses a Last-In-First-Out (LIFO) approach?",
                    "Queue",
                    "Stack",
                    "Linked List",
                    "Tree",
                    "Stack"
            ));

            quizArr.add(new Quiz("What is the time complexity of binary search in a sorted array?",
                    "O(1)",
                    "O(n)",
                    "O(log n)",
                    "O(n^2)",
                    "O(log n)"
            ));

            quizArr.add(new Quiz("Which layer of the OSI model is responsible for routing and addressing in computer networks?",
                    "Physical Layer",
                    "Data Link Layer",
                    "Network Layer",
                    "Transport Layer",
                    "Network Layer"
            ));

            quizArr.add(new Quiz("What is the purpose of DNS (Domain Name System) in computer networks?",
                    "To encrypt data transmission",
                    "To map domain names to IP addresses",
                    "To establish secure connections",
                    "To compress data",
                    "To map domain names to IP addresses"
            ));

            quizArr.add(new Quiz("Which data structure is used to organize data in a hierarchical tree-like structure?",
                    "Stack",
                    "Queue",
                    "Graph",
                    "Tree",
                    "Tree"
            ));

            quizArr.add(new Quiz("What is the primary goal of an operating system's file management system?",
                    "To create files",
                    "To delete files",
                    "To organize and control access to files and directories",
                    "To format storage devices",
                    "To organize and control access to files and directories"
            ));

            quizArr.add(new Quiz("Which algorithm is used for finding the shortest path in a weighted graph?",
                    "Depth-First Search (DFS)",
                    "Breadth-First Search (BFS)",
                    "Dijkstra's Algorithm",
                    "Kruskal's Algorithm",
                    "Dijkstra's Algorithm"
            ));

            quizArr.add(new Quiz("What is the Turing machine in the theory of automata?",
                    "A finite automaton",
                    "A machine with an infinite tape and a finite set of rules",
                    "A machine with multiple tapes",
                    "A machine that can recognize context-free languages",
                    "A machine with an infinite tape and a finite set of rules"
            ));

            quizArr.add(new Quiz("Which sorting algorithm has the best average and worst-case time complexity?",
                    "Bubble Sort",
                    "Quick Sort",
                    "Selection Sort",
                    "Merge Sort",
                    "Merge Sort"
            ));

            quizArr.add(new Quiz("What is the purpose of the Transport Layer in the OSI model?",
                    "To physically transmit data",
                    "To establish and manage network connections",
                    "To provide error detection and correction",
                    "To ensure data integrity and end-to-end communication",
                    "To ensure data integrity and end-to-end communication"
            ));

            quizArr.add(new Quiz("In computer networks, what is the role of a router?",
                    "To connect devices within a LAN (Local Area Network)",
                    "To transmit data over the internet",
                    "To manage file storage",
                    "To print documents",
                    "To transmit data over the internet"
            ));


            // Python Questions
            quizArr.add(new Quiz("What is Python?",
                    "A high-level programming language",
                    "A type of snake",
                    "A programming language used only for web development",
                    "A video game",
                    "A high-level programming language"
            ));
            quizArr.add(new Quiz("What is the Python interpreter?",
                    "A tool for translating Python code into machine code",
                    "A person who explains Python code to others",
                    "A program that executes Python code line by line",
                    "A device for measuring Python code quality",
                    "A program that executes Python code line by line"
            ));
            quizArr.add(new Quiz("What does the 'print' function do in Python?",
                    "It plays music",
                    "It sends text to the printer",
                    "It displays text on the screen",
                    "It calculates mathematical equations",
                    "It displays text on the screen"
            ));
            quizArr.add(new Quiz("What is a 'list' in Python?",
                    "A collection of ordered elements",
                    "A Python keyword",
                    "A type of snake",
                    "A math function",
                    "A collection of ordered elements"
            ));

            // Add 16 more Python questions here...

            // C and C++ Questions
            quizArr.add(new Quiz("What is C++?",
                    "A high-level programming language",
                    "An operating system",
                    "A programming language used for web development",
                    "A type of coffee",
                    "A high-level programming language"
            ));
            quizArr.add(new Quiz("What is the C++ Standard Library?",
                    "A library of books about C++",
                    "A collection of C++ compilers",
                    "A collection of pre-written C++ code",
                    "A group of C++ experts",
                    "A collection of pre-written C++ code"
            ));
            quizArr.add(new Quiz("What is a 'pointer' in C and C++?",
                    "A device for pointing at things on the screen",
                    "A variable that stores the memory address of another variable",
                    "A type of data structure",
                    "A way to draw lines in C++ graphics",
                    "A variable that stores the memory address of another variable"
            ));
            quizArr.add(new Quiz("What is 'object-oriented programming' (OOP) in C++?",
                    "A way to create objects in real life",
                    "A programming paradigm based on objects and classes",
                    "A way to write code without using objects",
                    "A type of C++ compiler",
                    "A programming paradigm based on objects and classes"
            ));

            // Add 16 more C and C++ questions here...

            // Cybersecurity Questions
            quizArr.add(new Quiz("What is cybersecurity?",
                    "A type of computer virus",
                    "A method of secure file storage",
                    "The practice of protecting computer systems from theft or damage",
                    "A type of computer game",
                    "The practice of protecting computer systems from theft or damage"
            ));
            quizArr.add(new Quiz("What is 'phishing' in the context of cybersecurity?",
                    "A type of fishing",
                    "A method of catching cybercriminals",
                    "A fraudulent attempt to obtain sensitive information by pretending to be trustworthy",
                    "A type of computer virus",
                    "A fraudulent attempt to obtain sensitive information by pretending to be trustworthy"
            ));
            quizArr.add(new Quiz("What is a 'firewall' in cybersecurity?",
                    "A wall made of fire-resistant material",
                    "A security system that monitors and controls network traffic",
                    "A type of computer virus",
                    "A device for starting fires",
                    "A security system that monitors and controls network traffic"
            ));
            quizArr.add(new Quiz("What is 'encryption' in cybersecurity?",
                    "A method of writing code in a secret language",
                    "A way to hide files on a computer",
                    "A process of converting data into a code to prevent unauthorized access",
                    "A type of computer game",
                    "A process of converting data into a code to prevent unauthorized access"
            ));

            // Add 16 more Cybersecurity questions here...

            // Cloud Computing Questions
            quizArr.add(new Quiz("What is cloud computing?",
                    "A type of weather prediction",
                    "A method of storing data on physical servers",
                    "The delivery of computing services over the internet",
                    "A type of cloud formation",
                    "The delivery of computing services over the internet"
            ));
            quizArr.add(new Quiz("What is 'SaaS' in cloud computing?",
                    "Software as a Service",
                    "Superior as a Service",
                    "Storage as a Service",
                    "System as a Service",
                    "Software as a Service"
            ));
            quizArr.add(new Quiz("What is a 'virtual machine' in cloud computing?",
                    "A computer that only exists in a virtual world",
                    "A software emulation of a physical computer",
                    "A type of cloud formation",
                    "A machine for making virtual coffee",
                    "A software emulation of a physical computer"
            ));
            quizArr.add(new Quiz("What is 'scalability' in cloud computing?",
                    "The ability to climb mountains",
                    "The ability to automatically adjust resources to handle increased workloads",
                    "The ability to write code in a scalable way",
                    "The ability to measure cloud storage",
                    "The ability to automatically adjust resources to handle increased workloads"
            ));

            // Add 16 more Cloud Computing questions here...

            // Data Science Questions
            quizArr.add(new Quiz("What is data science?",
                    "The study of data in ancient civilizations",
                    "A branch of mathematics",
                    "The practice of using data to gain insights and make decisions",
                    "The study of fictional data",
                    "The practice of using data to gain insights and make decisions"
            ));
            quizArr.add(new Quiz("What is 'machine learning'?",
                    "A way to teach computers how to learn",
                    "A type of computer virus",
                    "A method of writing code",
                    "A type of coffee",
                    "A way to teach computers how to learn"
            ));
            quizArr.add(new Quiz("What is 'data analysis'?",
                    "The process of collecting data",
                    "The process of analyzing data to extract useful information",
                    "The process of deleting data",
                    "The process of storing data",
                    "The process of analyzing data to extract useful information"
            ));


            // Python Questions
            quizArr.add(new Quiz("What is Python primarily used for?",
                    "Web development",
                    "Data analysis",
                    "Building cars",
                    "Writing novels",
                    "Data analysis"
            ));

            quizArr.add(new Quiz("What symbol is used to start a comment in Python?",
                    "//",
                    "#",
                    "/* */",
                    "--",
                    "#"
            ));

            quizArr.add(new Quiz("What is the output of the following code?\n"
                    + "x = 5\n"
                    + "y = 3\n"
                    + "print(x % y)",
                    "2",
                    "1.67",
                    "0.6",
                    "3",
                    "2"
            ));

            quizArr.add(new Quiz("Which of the following is not a valid data type in Python?",
                    "int",
                    "float",
                    "string",
                    "boolean",
                    "boolean"
            ));

            quizArr.add(new Quiz("What does the 'len()' function in Python do?",
                    "Returns the largest number in a list",
                    "Returns the length of a list or string",
                    "Calculates the logarithm of a number",
                    "Converts a number to a string",
                    "Returns the length of a list or string"
            ));

            // C and C++ Questions
            quizArr.add(new Quiz("What is the difference between C and C++?",
                    "C is an older version of C++",
                    "C is a high-level language, while C++ is low-level",
                    "C has no object-oriented features, while C++ does",
                    "C++ is a scripting language, while C is not",
                    "C has no object-oriented features, while C++ does"
            ));

            quizArr.add(new Quiz("What is the purpose of a header file in C/C++?",
                    "To store user data",
                    "To include code from other files",
                    "To define mathematical constants",
                    "To declare global variables",
                    "To include code from other files"
            ));

            quizArr.add(new Quiz("Which operator is used to allocate memory dynamically in C/C++?",
                    "new",
                    "malloc",
                    "allocate",
                    "create",
                    "new"
            ));

            quizArr.add(new Quiz("What is a pointer in C/C++?",
                    "A variable that stores the address of another variable",
                    "A variable that stores a character",
                    "A data type for storing text",
                    "A variable that cannot be changed",
                    "A variable that stores the address of another variable"
            ));

            quizArr.add(new Quiz("What is the purpose of the 'break' statement in a loop in C/C++?",
                    "To exit the loop and continue with the next iteration",
                    "To restart the loop from the beginning",
                    "To skip the current iteration and continue with the next one",
                    "To terminate the program",
                    "To exit the loop and continue with the next iteration"
            ));

            // Cybersecurity Questions
            quizArr.add(new Quiz("What is a firewall in cybersecurity?",
                    "A physical barrier in front of a computer",
                    "A software or hardware security system that filters network traffic",
                    "A tool for hacking into systems",
                    "A type of computer virus",
                    "A software or hardware security system that filters network traffic"
            ));

            quizArr.add(new Quiz("What is a DDoS attack?",
                    "A type of antivirus software",
                    "A distributed database system",
                    "A method of securing data",
                    "An attack that overwhelms a system with traffic to make it unavailable",
                    "An attack that overwhelms a system with traffic to make it unavailable"
            ));

            quizArr.add(new Quiz("What does VPN stand for in cybersecurity?",
                    "Virtual Private Network",
                    "Very Personal Network",
                    "Virtual Public Network",
                    "Visible Private Network",
                    "Virtual Private Network"
            ));

            quizArr.add(new Quiz("What is the most common method of authentication in cybersecurity?",
                    "Passwords",
                    "Retinal scans",
                    "DNA analysis",
                    "Handshakes",
                    "Passwords"
            ));

            quizArr.add(new Quiz("What is social engineering in the context of cybersecurity?",
                    "A type of computer virus",
                    "A method of manipulating people to reveal sensitive information",
                    "A technique for encrypting data",
                    "A security protocol",
                    "A method of manipulating people to reveal sensitive information"
            ));


            quizArr.add(new Quiz("What is the purpose of a 'lambda' function in Python?",
                    "To declare a variable",
                    "To create anonymous functions",
                    "To print text to the console",
                    "To define a class",
                    "To create anonymous functions"
            ));

            quizArr.add(new Quiz("How do you open a file for writing in Python?",
                    "open('file.txt', 'r')",
                    "open('file.txt', 'a')",
                    "open('file.txt', 'w')",
                    "open('file.txt', 'x')",
                    "open('file.txt', 'w')"
            ));

            quizArr.add(new Quiz("What does 'PEP' stand for in the context of Python?",
                    "Python Extension Proposal",
                    "Python Enhancement Proposal",
                    "Python Environment Package",
                    "Python Encoding Protocol",
                    "Python Enhancement Proposal"
            ));

            quizArr.add(new Quiz("What is the 'self' keyword used for in Python classes?",
                    "To define a new class",
                    "To call a function",
                    "To refer to the instance of the class",
                    "To import modules",
                    "To refer to the instance of the class"
            ));

            // C and C++ Questions (Additional)
            quizArr.add(new Quiz("What is the difference between 'int' and 'double' in C/C++?",
                    "'int' is used for integers, while 'double' is used for floating-point numbers",
                    "'int' is used for text, while 'double' is used for numbers",
                    "'int' is used for functions, while 'double' is used for variables",
                    "'int' is used for loops, while 'double' is used for conditions",
                    "'int' is used for integers, while 'double' is used for floating-point numbers"
            ));

            quizArr.add(new Quiz("What is a constructor in C/C++?",
                    "A function that destroys objects",
                    "A function that initializes objects",
                    "A variable that holds the class definition",
                    "A function that prints output",
                    "A function that initializes objects"
            ));

            quizArr.add(new Quiz("What is the purpose of 'namespace' in C++?",
                    "To define a new programming language",
                    "To group related code together and avoid naming conflicts",
                    "To create a new class",
                    "To print output to the console",
                    "To group related code together and avoid naming conflicts"
            ));

            quizArr.add(new Quiz("What is a 'template' in C++?",
                    "A blueprint for designing classes",
                    "A library for graphics",
                    "A file format",
                    "A programming language",
                    "A blueprint for designing classes"
            ));

            // Cybersecurity Questions (Additional)
            quizArr.add(new Quiz("What is 'phishing' in cybersecurity?",
                    "A method of catching fish",
                    "A type of computer virus",
                    "A social engineering attack that tricks users into revealing information",
                    "A secure way of browsing the internet",
                    "A social engineering attack that tricks users into revealing information"
            ));

            quizArr.add(new Quiz("What is 'malware' short for?",
                    "Malicious software",
                    "Management software",
                    "Marketing software",
                    "Mathematical software",
                    "Malicious software"
            ));

            quizArr.add(new Quiz("What is 'two-factor authentication' (2FA) in cybersecurity?",
                    "A method of authentication using two different types of passwords",
                    "A method of authentication using two separate computers",
                    "A method of authentication using two different web browsers",
                    "A method of authentication using two different programming languages",
                    "A method of authentication using two different types of passwords"
            ));

            quizArr.add(new Quiz("What is 'encryption' in cybersecurity?",
                    "A method of encoding data to make it unreadable without the proper key",
                    "A method of compressing data to save storage space",
                    "A method of organizing data in a database",
                    "A method of deleting data permanently",
                    "A method of encoding data to make it unreadable without the proper key"
            ));

            // Add more questions in other categories as requested...

            // Cloud Computing Questions (Additional)
            quizArr.add(new Quiz("What is 'IaaS' in cloud computing?",
                    "Internet as a Service",
                    "Infrastructure as a Service",
                    "Information as a Service",
                    "Integration as a Service",
                    "Infrastructure as a Service"
            ));

            quizArr.add(new Quiz("What is a 'virtual machine' (VM) in cloud computing?",
                    "A computer that exists only in the virtual world",
                    "A physical server",
                    "A software application",
                    "A type of cloud storage",
                    "A computer that exists only in the virtual world"
            ));

            quizArr.add(new Quiz("What is 'scaling' in the context of cloud services?",
                    "A method for measuring the speed of internet connections",
                    "A technique for balancing loads across multiple servers",
                    "A type of cloud storage",
                    "A method for encrypting data",
                    "A technique for balancing loads across multiple servers"
            ));

            quizArr.add(new Quiz("What does 'SaaS' stand for in cloud computing?",
                    "Software as a Service",
                    "Storage as a Service",
                    "Security as a Service",
                    "Server as a Service",
                    "Software as a Service"
            ));

            // Data Science Questions (Additional)
            quizArr.add(new Quiz("What is 'data cleansing' in data science?",
                    "The process of washing data with soap and water",
                    "The process of removing errors and inconsistencies from data sets",
                    "The process of organizing data into clean rows and columns",
                    "The process of encrypting sensitive data",
                    "The process of removing errors and inconsistencies from data sets"
            ));

            quizArr.add(new Quiz("What is the 'curse of dimensionality' in machine learning?",
                    "A spell cast by data scientists",
                    "A phenomenon where the performance of machine learning models degrades as the number of features or dimensions increases",
                    "A technique for improving model accuracy",
                    "A type of data visualization",
                    "A phenomenon where the performance of machine learning models degrades as the number of features or dimensions increases"
            ));

            quizArr.add(new Quiz("What is 'overfitting' in machine learning?",
                    "Fitting into tight clothes",
                    "A modeling error where a machine learning model performs well on training data but poorly on unseen data",
                    "A modeling error where a machine learning model performs well on all data",
                    "A type of data preprocessing",
                    "A modeling error where a machine learning model performs well on training data but poorly on unseen data"
            ));

            quizArr.add(new Quiz("What is 'precision' in the context of classification models?",
                    "The accuracy of a measurement instrument",
                    "The number of true positive predictions divided by the total number of positive predictions",
                    "The ability of a model to make predictions quickly",
                    "The number of true positive predictions divided by the total number of actual positive cases",
                    "The number of true positive predictions divided by the total number of positive predictions"
            ));

            quizArr.add(new Quiz("What is 'phishing' in the context of cybersecurity?",
                    "A type of fishing in cyberspace",
                    "A social engineering attack that involves tricking individuals into revealing sensitive information",
                    "A type of malware",
                    "A firewall setting",
                    "A social engineering attack that involves tricking individuals into revealing sensitive information"
            ));

            quizArr.add(new Quiz("What is 'two-factor authentication' (2FA) used for in cybersecurity?",
                    "To authenticate a user using two biometric factors",
                    "To provide access to a single user account on multiple devices",
                    "To add an extra layer of security by requiring two forms of identification to log in",
                    "To encrypt data in transit",
                    "To add an extra layer of security by requiring two forms of identification to log in"
            ));

            quizArr.add(new Quiz("What is a 'firewall' in network security?",
                    "A physical barrier that protects servers from physical damage",
                    "A security device or software that monitors and filters incoming and outgoing network traffic",
                    "A type of computer virus",
                    "A security measure that protects against natural disasters",
                    "A security device or software that monitors and filters incoming and outgoing network traffic"
            ));

            quizArr.add(new Quiz("What is 'malware' short for in cybersecurity?",
                    "Malicious Software",
                    "Managed Linear Regression",
                    "Maximum Likelihood Estimation",
                    "Machine Learning",
                    "Malicious Software"
            ));

            // Cloud Computing Questions (Additional)
            quizArr.add(new Quiz("What does 'PaaS' stand for in cloud computing?",
                    "Platform as a Service",
                    "Privacy as a Service",
                    "Performance as a Service",
                    "Pricing as a Service",
                    "Platform as a Service"
            ));

            quizArr.add(new Quiz("What is 'serverless computing' in cloud technology?",
                    "A computing model where servers are no longer needed",
                    "A computing model where servers are invisible to users",
                    "A computing model where servers are extremely expensive",
                    "A computing model where servers are made of plastic",
                    "A computing model where servers are invisible to users"
            ));

            // Data Science Questions (Additional)
            quizArr.add(new Quiz("What is 'cross-validation' in machine learning?",
                    "A method for exchanging validation datasets with other researchers",
                    "A technique for splitting data into two equal halves",
                    "A technique for assessing a model's performance by dividing the data into training and testing sets multiple times",
                    "A technique for creating cross-shaped data visualizations",
                    "A technique for assessing a model's performance by dividing the data into training and testing sets multiple times"
            ));

            quizArr.add(new Quiz("What is 'unsupervised learning' in machine learning?",
                    "A type of machine learning where there is no teacher or supervisor",
                    "A type of machine learning where all data is labeled with correct answers",
                    "A type of machine learning where the algorithm learns from a teacher",
                    "A type of machine learning where the algorithm is supervised by a human",
                    "A type of machine learning where there is no teacher or supervisor"
            ));



            // Python Questions (Additional)
            quizArr.add(new Quiz("What is Python's main use in the software development industry?",
                    "Web development",
                    "Data analysis and machine learning",
                    "Mobile app development",
                    "Game development",
                    "Data analysis and machine learning"
            ));

            quizArr.add(new Quiz("Which keyword is used to define a function in Python?",
                    "method",
                    "define",
                    "func",
                    "def",
                    "def"
            ));

            // C and C++ Questions (Additional)
            quizArr.add(new Quiz("What is the difference between 'C' and 'C++' programming languages?",
                    "'C++' is an updated version of 'C' with object-oriented features",
                    "'C++' is used only for web development, while 'C' is for general-purpose programming",
                    "'C' is an updated version of 'C++' with more features",
                    "'C' is a more modern language than 'C++'",
                    "'C++' is an updated version of 'C' with object-oriented features"
            ));

            quizArr.add(new Quiz("What is a 'pointer' in 'C' programming?",
                    "A special character used in strings",
                    "A variable that stores the memory address of another variable",
                    "A type of loop",
                    "A conditional statement",
                    "A variable that stores the memory address of another variable"
            ));

            // Cloud Computing Questions (Additional)
            quizArr.add(new Quiz("What is 'server virtualization' in cloud computing?",
                    "Running multiple virtual servers on a single physical server",
                    "Running physical servers without virtualization",
                    "Running servers in the cloud",
                    "Running servers without using the cloud",
                    "Running multiple virtual servers on a single physical server"
            ));

            quizArr.add(new Quiz("What is the primary benefit of 'elasticity' in cloud services?",
                    "Reduced initial setup costs",
                    "Automatic scaling of resources based on demand",
                    "Increased security",
                    "Improved user interface",
                    "Automatic scaling of resources based on demand"
            ));

            // Data Science Questions (Additional)
            quizArr.add(new Quiz("What is 'regression analysis' used for in data science?",
                    "Classifying data into categories",
                    "Finding patterns in unstructured data",
                    "Predicting a continuous value based on input data",
                    "Detecting anomalies in data",
                    "Predicting a continuous value based on input data"
            ));

            quizArr.add(new Quiz("What is 'overfitting' in machine learning?",
                    "When a model performs well on training data but poorly on new, unseen data",
                    "When a model is too simple to capture complex patterns in data",
                    "When a model perfectly fits the training data without errors",
                    "When a model is not trained long enough",
                    "When a model performs well on training data but poorly on new, unseen data"
            ));
        quizArr.add(new Quiz("What is the capital of France?",
                "Paris",
                "London",
                "Rome",
                "Berlin",
                "Paris"
        ));

        quizArr.add(new Quiz("What is the largest ocean in the world?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Arctic Ocean",
                "Pacific Ocean"
        ));

        quizArr.add(new Quiz("What is the highest mountain in the world?",
                "Mount Everest",
                "K2",
                "Kangchenjunga",
                "Lhotse",
                "Mount Everest"
        ));

        quizArr.add(new Quiz("What is the longest river in the world?",
                "Nile River",
                "Amazon River",
                "Yangtze River",
                "Yellow River",
                "Amazon River"
        ));

        quizArr.add(new Quiz("What is the capital of India?",
                "New Delhi",
                "Mumbai",
                "Chennai",
                "Kolkata",
                "New Delhi"
        ));

        quizArr.add(new Quiz("What is the capital of China?",
                "Beijing",
                "Shanghai",
                "Hong Kong",
                "Shenzhen",
                "Beijing"
        ));

        quizArr.add(new Quiz("What is the capital of Japan?",
                "Tokyo",
                "Osaka",
                "Kyoto",
                "Nagoya",
                "Tokyo"
        ));

        quizArr.add(new Quiz("What is the capital of South Korea?",
                "Seoul",
                "Busan",
                "Daegu",
                "Incheon",
                "Seoul"
        ));

        quizArr.add(new Quiz("What is the capital of Indonesia?",
                "Jakarta",
                "Surabaya",
                "Medan",
                "Bandung",
                "Jakarta"
        ));

        quizArr.add(new Quiz("What is the capital of Brazil?",
                "Brasilia",
                "Sao Paulo",
                "Rio de Janeiro",
                "Salvador",
                "Brasilia"
        ));

        quizArr.add(new Quiz("What is the capital of Mexico?",
                "Mexico City",
                "Guadalajara",
                "Monterrey",
                "Cancun",
                "Mexico City"
        ));
        quizArr.add(new Quiz("What is the capital of Spain?",
                "Madrid",
                "Barcelona",
                "Valencia",
                "Seville",
                "Madrid"
        ));

        quizArr.add(new Quiz("What is the capital of Italy?",
                "Rome",
                "Milan",
                "Naples",
                "Turin",
                "Rome"
        ));

        quizArr.add(new Quiz("What is the capital of Germany?",
                "Berlin",
                "Munich",
                "Hamburg",
                "Frankfurt",
                "Berlin"
        ));

        quizArr.add(new Quiz("What is the capital of Russia?",
                "Moscow",
                "Saint Petersburg",
                "Kazan",
                "Samara",
                "Moscow"
        ));

        quizArr.add(new Quiz("What is the capital of Turkey?",
                "Ankara",
                "Istanbul",
                "Izmir",
                "Adana",
                "Ankara"
        ));

        quizArr.add(new Quiz("What is the capital of Egypt?",
                "Cairo",
                "Alexandria",
                "Giza",
                "Luxor",
                "Cairo"
        ));

        quizArr.add(new Quiz("What is the capital of Argentina?",
                "Buenos Aires",
                "Córdoba",
                "Rosario",
                "Mendoza",
                "Buenos Aires"
        ));

        quizArr.add(new Quiz("What is the capital of Australia?",
                "Canberra",
                "Sydney",
                "Melbourne",
                "Perth",
                "Canberra"
        ));

        quizArr.add(new Quiz("What is the capital of Canada?",
                "Ottawa",
                "Toronto",
                "Montreal",
                "Vancouver",
                "Ottawa"
        ));

        quizArr.add(new Quiz("What is the capital of the United States?",
                "Washington, D.C.",
                "New York City",
                "Los Angeles",
                "Chicago",
                "Washington, D.C."
        ));

        quizArr.add(new Quiz("What is the capital of the United Kingdom?",
                "London",
                "Edinburgh",
                "Cardiff",
                "Belfast",
                "London"
        ));
        quizArr.add(new Quiz("What is the capital of Switzerland?",
                "Bern",
                "Zurich",
                "Geneva",
                "Lausanne",
                "Bern"
        ));

        quizArr.add(new Quiz("What is the capital of the Netherlands?",
                "Amsterdam",
                "The Hague",
                "Rotterdam",
                "Utrecht",
                "The Hague"
        ));

        quizArr.add(new Quiz("What is the capital of Belgium?",
                "Brussels",
                "Antwerp",
                "Ghent",
                "Liège",
                "Brussels"
        ));

        quizArr.add(new Quiz("What is the capital of Norway?",
                "Oslo",
                "Bergen",
                "Trondheim",
                "Stavanger",
                "Oslo"
        ));

        quizArr.add(new Quiz("What is the capital of Sweden?",
                "Stockholm",
                "Gothenburg",
                "Malmö",
                "Uppsala",
                "Stockholm"
        ));

        quizArr.add(new Quiz("What is the capital of Denmark?",
                "Copenhagen",
                "Aarhus",
                "Odense",
                "Esbjerg",
                "Copenhagen"
        ));

        quizArr.add(new Quiz("What is the capital of Finland?",
                "Helsinki",
                "Tampere",
                "Turku",
                "Oulu",
                "Helsinki"
        ));

        quizArr.add(new Quiz("What is the capital of Iceland?",
                "Reykjavík",
                "Akureyri",
                "Hafnarfjörður",
                "Vestmannaeyjar",
                "Reykjavík"
        ));

        quizArr.add(new Quiz("What is the capital of Austria?",
                "Vienna",
                "Salzburg",
                "Graz",
                "Innsbruck",
                "Vienna"
        ));

        quizArr.add(new Quiz("What is the capital of Greece?",
                "Athens",
                "Thessaloniki",
                "Patra",
                "Larissa",
                "Athens"
        ));

        quizArr.add(new Quiz("What is the capital of Portugal?",
                "Lisbon",
                "Porto",
                "Braga",
                "Setúbal",
                "Lisbon"
        ));
        quizArr.add(new Quiz("What is the name of the largest ocean in the solar system?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Arctic Ocean",
                "Pacific Ocean"
        ));

        quizArr.add(new Quiz("What is the name of the largest desert in the world?",
                "Sahara Desert",
                "Gobi Desert",
                "Arabian Desert",
                "Taklamakan Desert",
                "Sahara Desert"
        ));

        quizArr.add(new Quiz("What is the name of the highest mountain range in the world?",
                "Himalayas",
                "Andes",
                "Rocky Mountains",
                "Alps",
                "Himalayas"
        ));

        quizArr.add(new Quiz("What is the name of the longest river in Asia?",
                "Yangtze River",
                "Yellow River",
                "Mekong River",
                "Ganges River",
                "Yangtze River"
        ));

        quizArr.add(new Quiz("What is the name of the largest country in the world by area?",
                "Russia",
                "Canada",
                "China",
                "United States",
                "Russia"
        ));

        quizArr.add(new Quiz("What is the name of the smallest country in the world by area?",
                "Vatican City",
                "Monaco",
                "Nauru",
                "Tuvalu",
                "Vatican City"
        ));

        quizArr.add(new Quiz("What is the name of the largest country in Africa by area?",
                "Algeria",
                "Democratic Republic of the Congo",
                "Sudan",
                "South Africa",
                "Algeria"
        ));

        quizArr.add(new Quiz("What is the name of the smallest country in Europe by area?",
                "Vatican City",
                "Monaco",
                "San Marino",
                "Andorra",
                "Vatican City"
        ));

        quizArr.add(new Quiz("What is the name of the longest river in Africa?",
                "Nile River",
                "Congo River",
                "Niger River",
                "Zambesi River",
                "Nile River"
        ));

        quizArr.add(new Quiz("What is the name of the largest ocean in the Southern Hemisphere?",
                "Pacific Ocean",
                "Atlantic Ocean",
                "Indian Ocean",
                "Southern Ocean",
                "Southern Ocean"
        ));

        quizArr.add(new Quiz("What is the name of the smallest continent in the world?",
                "Australia",
                "Antarctica",
                "Europe",
                "Asia",
                "Australia"
        ));

        quizArr.add(new Quiz("What is the name of the largest country in the Southern Hemisphere by area?",
                "Argentina",
                "Australia",
                "Brazil",
                "Canada",
                "Australia"
        ));

        quizArr.add(new Quiz("What is the name of the smallest country in the Southern Hemisphere by area?",
                "Nauru",
                "Tuvalu",
                "Saint Kitts and Nevis",
                "Saint Vincent and the Grenadines",
                "Nauru"
        ));

        quizArr.add(new Quiz("What is the name of the longest river in South America?",
                "Amazon River",
                "Orinoco River",
                "Paraná River",
                "Magdalena River",
                "Amazon River"
        ));

        quizArr.add(new Quiz("What is the name of the largest country in South America by area?",
                "Brazil",
                "Argentina",
                "Peru",
                "Colombia",
                "Brazil"
        ));

        quizArr.add(new Quiz("What is the name of the smallest country in South America by area?",
                "Suriname",
                "Guyana",
                "French Guiana",
                "Uruguay",
                "Suriname"
        ));

        quizArr.add(new Quiz("What is the name of the largest country in North America by area?",
                "Canada",
                "United States",
                "Mexico",
                "Greenland",
                "Canada"));

        quizArr.add(new Quiz("Who is considered the first emperor of India?",
                "Ashoka the Great",
                "Chandragupta Maurya",
                "Akbar the Great",
                "Shivaji Maharaj",
                "Chandragupta Maurya"
        ));

        quizArr.add(new Quiz("What is the name of the first major Indian civilization?",
                "Indus Valley Civilization",
                "Harappan Civilization",
                "Mohenjo-daro Civilization",
                "Gupta Civilization",
                "Indus Valley Civilization"
        ));

        quizArr.add(new Quiz("What is the name of the capital of the Mughal Empire?",
                "Agra",
                "Delhi",
                "Fatehpur Sikri",
                "Jaipur",
                "Agra"
        ));

        quizArr.add(new Quiz("What is the name of the language that was spoken in the Indus Valley Civilization?",
                "Sanskrit",
                "Pali",
                "Prakrit",
                "Harappan",
                "Harappan"
        ));

        quizArr.add(new Quiz("What is the name of the first Indian mathematician to develop the concept of zero?",
                "Aryabhata",
                "Brahmagupta",
                "Mahavira",
                "Surya Siddhanta",
                "Aryabhata"
        ));

        quizArr.add(new Quiz("What is the name of the Indian epic poem that tells the story of the Pandavas and Kauravas?",
                "Ramayana",
                "Mahabharata",
                "Katha Sarit Sagara",
                "Panchatantra",
                "Mahabharata"
        ));

        quizArr.add(new Quiz("What is the name of the Indian saint who is credited with spreading Hinduism in Southeast Asia?",
                "Buddha",
                "Mahavira",
                "Nalanda",
                "Adi Shankaracharya",
                "Adi Shankaracharya"
        ));

        quizArr.add(new Quiz("What is the name of the Indian freedom fighter who is known as the 'Mother of India'?",
                "Indira Gandhi",
                "Lal Bahadur Shastri",
                "Mahatma Gandhi",
                "Subhas Chandra Bose",
                "Mahatma Gandhi"
        ));

        quizArr.add(new Quiz("What is the name of the Indian independence movement that was led by Mahatma Gandhi?",
                "Non-Cooperation Movement",
                "Quit India Movement",
                "Salt Satyagraha",
                "Swaraj Movement",
                "Non-Cooperation Movement"
        ));

        quizArr.add(new Quiz("What is the name of the Indian constitution that was adopted in 1950?",
                "Indian Constitution",
                "Constituent Assembly of India",
                "Preamble of the Indian Constitution",
                "Fundamental Rights",
                "Indian Constitution"
        ));

        quizArr.add(new Quiz("What is the name of the Indian prime minister who was assassinated in 1984?",
                "Indira Gandhi",
                "Lal Bahadur Shastri",
                "Mahatma Gandhi",
                "Subhas Chandra Bose",
                "Indira Gandhi"
        ));

        quizArr.add(new Quiz("What is the name of the Indian state that is known for its forts and palaces?",
                "Rajasthan",
                "Gujarat",
                "Madhya Pradesh",
                "Uttar Pradesh",
                "Rajasthan"
        ));

        quizArr.add(new Quiz("What is the name of the Indian state that is known for its beaches and backwaters?",
                "Kerala",
                "Tamil Nadu",
                "Andhra Pradesh",
                "Goa",
                "Goa"
        ));

        quizArr.add(new Quiz("What is the name of the Indian state that is known for its tea plantations?",
                "Assam",
                "West Bengal",
                "Tamil Nadu",
                "Kerala",
                "Assam"
        ));

        quizArr.add(new Quiz("What is the name of the Indian state that is known for its deserts?",
                "Rajasthan",
                "Gujarat",
                "Madhya Pradesh",
                "Uttar Pradesh",
                "Rajasthan"));



                // Add more questions in other categories as requested...
        }


        private void setDataToViews(int currentpos){
        qnNoTV.setText("Question Attempted : "+qnAttempted +"/15");

        if(qnAttempted == 15){
            showBottomSheet();
        }else{
            qnTV.setText(quizArr.get(currentpos).getQuestion());
            b1.setText(quizArr.get(currentpos).getOption1());
            b2.setText(quizArr.get(currentpos).getOption2());
            b3.setText(quizArr.get(currentpos).getOption3());
            b4.setText(quizArr.get(currentpos).getOption4());

            }
        }
        private void showBottomSheet(){
            BottomSheetDialog bsd = new BottomSheetDialog(MainActivity.this);
            View bsv = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score,(LinearLayout)findViewById(R.id.ll));
            TextView scortv = bsv.findViewById(R.id.TVScore);
            Button restart = bsv.findViewById(R.id.btnRestart);
            scortv.setText("Your Score is \n"+currentScore+"/15");
            restart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentpos = random.nextInt(quizArr.size());
                    setDataToViews (currentpos);
                    qnAttempted = 1;
                    currentScore = 0;
                    bsd.dismiss();
                }
            });
            bsd.setCancelable(false);
            bsd.setContentView(bsv);
            bsd.show();

        }

    }





