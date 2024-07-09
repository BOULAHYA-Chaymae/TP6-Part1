**Activité Pratique N° 6 - Architectures Micro-services**  
**-Partie 1:**  
**1-MIcro Service avec Web Service RESTFUL**  
l'architecture microservices avec des Web Services RESTful permet de structurer l'application bancaire en composants indépendants. Chaque microservice, comme le AccountRestController, expose des API RESTful pour gérer des entités spécifiques telles que les comptes bancaires. Cette approche permet une gestion décentralisée et modulable des fonctionnalités de l'application.  
![image](https://github.com/BOULAHYA-Chaymae/TP6-Part1/assets/167257389/67e9d86b-32af-4d39-ae68-47276b6af2f1)  
**2-Micro-SERVICE wvec web service GRAPHQ**  
Dans une architecture de microservices utilisant GraphQL, chaque service peut exposer des API pour des opérations spécifiques, telles que la gestion des comptes bancaires et des clients, comme illustré dans le BankAccountGraphQLController. Ce contrôleur permet de réaliser des requêtes et des mutations via GraphQL, offrant une flexibilité accrue par rapport aux RESTful APIs traditionnelles. Par exemple, les méthodes accountsList, bankAccountById, et customers permettent de récupérer des listes et des détails d'entités spécifiques, tandis que addAccount, updateAccount, et deleteAccount permettent de modifier les données des comptes bancaires  
![image](https://github.com/BOULAHYA-Chaymae/TP6-Part1/assets/167257389/9c03a634-23fd-42e6-90e8-5127155c1604)

