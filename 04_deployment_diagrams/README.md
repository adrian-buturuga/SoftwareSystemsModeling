# Deployment Diagrams

Deployment diagrams offer the link between the software and the hardware that it is going to be running on. 

Software elements are represented as artifacts (rectangles with the artifact name and the file glyph in the right corner) and are placed inside nodes (containers). Communication between nodes is represented as arrows called communication paths. Nodes are represented as 3D boxes with the node name written within. 

An execution environment is a specialized node that represents a software configuration hosting specific types of artifacts. It is expected to provide specific services to hosted artifacts (eg: a web page requires specific functionality of a web server in order to work properly, such as load balancing, special compilers, etc). This can be represented by creating a specific stereotype (eg: `<<Web Server>>`).

Communication paths represent generic communication between nodes. It is represented as a line (no direction is needed, since communication is usually bi-directional).

Deployment diagrams are mostly used by dev ops or system administrators for describing:

- modeling the network topology
- modeling distributed systems
- forwards and reverse engineering systems

![example](https://online.visual-paradigm.com/images/tutorials/deployment-diagram-tutorial/04-deployment-diagram-node-and-artifacts.png)