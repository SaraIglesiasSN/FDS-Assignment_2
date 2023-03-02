# FDS-Assignment_2

Students:

Sara Iglesias (sXXXXXXX)
Simon Rozenberg Travancas (s5351618)
Yin "Johnny" Silver (sXXXXXXX)

This repository/folder contains the solutions for group 15 of the Fundamentals of Distributed Systems RUG M.Sc. course for 2023, semester IIa.

The solution for the assignment a is inside the folder "Sockets".

The solution for the assignment b is inside the folder "RMI".

The solution for the assignment c is inside the folder "RMIAtLeastOnce".

d: Due to possible failures, it is impossible to guarantee execution of a method exactly once in an asynchronous system. If the server fails and never responds to the client, due to the definition of an asynchronous system, it is impossible for the client to know that the server has indeed failed, and is not simply taking an arbitrarily large amount of time to execute. As such, the client can never send the request more than once if it never receives a failure from the server.
