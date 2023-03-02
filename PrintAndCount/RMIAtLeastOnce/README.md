For this exercise, we need the server to fail ocasionally. We will do so by adding a 50% chance of it throwing an exception. We can, this way, make it so that the client re-tries everytime it receives a failure. Since the RMI framework throws an exception on connection refused, the client will also send the request again if the server is down. The only case not covered by this code would be if the server hangs the call and never finishes executing, which appears to be outside the scope of this exercise. This case notwithstanding, the client will not stop sending the message until it receives a confirmation from the server.