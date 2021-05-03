docker run -it --rm -p 8500:8500 -p 8600:8600/udp --name=consul-dev consul agent -enable-script-checks -server -ui -node=server-1 -bootstrap-expect=1 -client=0.0.0.0
