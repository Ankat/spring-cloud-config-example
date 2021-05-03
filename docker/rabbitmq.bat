docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 -e RABBITMQ_DEFAULT_USER="ankat" -e RABBITMQ_DEFAULT_PASS="$m@r7C@rd" rabbitmq:3-management-alpine
