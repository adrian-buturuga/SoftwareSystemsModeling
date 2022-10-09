

Modelarea unui pipeline

* librarie care permite citirea/scrierea datelor (de) pe coada 
* 3 producatori de date: 1 ofera date despre temperatura, 1 ofera date despre luminozitate, 1 ofera date despre numarul de persoane dintr-o camera
* 2 listeneri pentru date: 1 ofera un dashboard cu valorile curente in fiecare spatiu, 1 face analiza pe date pentru a optimiza costurile

Suntem devopsi, trebuie sa implementam pipeline-urile pentru build, ci/cd pentru toate environment-urile (dev, test, prod)

- environment specific properties
- liveness / readyness probes
- disaster recovery 
- application scaling
- threat modelling 

--------------------------------

Steps devops: 
- what were the requirements: use case diagram, component diagram, deployment diagram
- examples of data: usefull for determining limits of usages (data size, connection counts, etc) => notes on existing diagrams (component / deployment)
- correctness of data: not interested. 
- pipeline testing + compile + package + whatever: activity diagram
- health of deployed service: component diagram (describing contract)
- disaster recovery: deployment diagram (for identifying potential disasters) + activity diagrams (for recovering from disasters)
- threat modelling: use case diagram (identify actors + usage), deployment (identify pottential disasters / man-in-the-middle attacks / etc). 

Business Analyst/Requirements Analyst:
- what has been done and who can perform action: use case diagram
- what were the expectations of a use case (and alternate (unhappy) endings): use case specifications / activity + state + sequence diagrams 

Program / Project Manager:
- what are the costs of operating production: deployment diagram

Dev:
- component + class primarily + any other diagram secondarily 
