run:
	mvn quarkus:dev -pl application -am install

billing:
	mvn quarkus:dev -pl billing -am install

user:
	mvn quarkus:dev -pl user
