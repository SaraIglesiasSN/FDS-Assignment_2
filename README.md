# FDS-Assignment_2

Students:

- Sara Iglesias Suárez-Noguerol (s5378176)
- Simon Rozenberg Travancas (s5351618)
- Junsheng Yin (s4774280)

This repository/folder contains the solutions for group 15 of the Fundamentals of Distributed Systems RUG M.Sc. course for 2023, semester IIa.

Before we go into the answers to the questions, a few important remark:

The `rmiregistry 1099` command needs to be interrupted and run again between runs of the server processes. Otherwise the server fails to establish a connection to the RMI Registry.

for each assignment, we have 3 scripts: `compileBinaries.sh`, `runServer.sh` and `runClient.sh`. For each of the assignments, you need to cd into the assignment folder (`Sockets`, `RMI`, and `RMIAtLeastOnce`), and then run `compileBinaries.sh` once, then run in 2 different terminals the `./runServer.sh` and `./runClient.sh`. Explanations of the solutions can be found in the `README.md`s inside each of the assignment folders.

Now, without further ado, the solution to the problems:

The solution for the assignment a is inside the folder "Sockets".

The solution for the assignment b is inside the folder "RMI".

The solution for the assignment c is inside the folder "RMIAtLeastOnce".

d: Due to possible failures, it is impossible to guarantee execution of a method exactly once in an asynchronous system. If the server fails and never responds to the client, due to the definition of an asynchronous system, it is impossible for the client to know that the server has indeed failed, and is not simply taking an arbitrarily large amount of time to execute. As such, the client can never send the request more than once if it never receives a failure from the server.
