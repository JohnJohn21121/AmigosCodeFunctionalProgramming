FROM mcr.microsoft.com/devcontainers/anaconda:0-3

# Copiar environment.yml (si se encuentra) a una ubicación temporal para actualizar el entorno.
# También se copia "noop.txt" para evitar que la instrucción COPY falle si no existe environment.yml.
COPY environment.yml* .devcontainer/noop.txt /tmp/conda-tmp/

# Establecer la variable de entorno PYTHONPATH con la ruta absoluta del proyecto
ENV PYTHONPATH=/home/johnjohn21121/John-Temple-of-Practice/HelloWorld-Django

# Actualizar el entorno Conda si se encuentra environment.yml
RUN if [ -f "/tmp/conda-tmp/environment.yml" ]; then umask 0002 && /opt/conda/bin/conda env update -n base -f /tmp/conda-tmp/environment.yml; fi \
    && rm -rf /tmp/conda-tmp

# [Opcional] Descomenta esta sección para instalar paquetes adicionales del sistema operativo.
# RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
#     && apt-get -y install --no-install-recommends <your-package-list-here>
