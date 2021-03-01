### Kubernetes files

These files are basic K8s configuration file to deploy this service to the IMGARENA Kubernetes cluster in the **_streams_** namespace.

Please remember to add the following to the _fluxcd/k8s/dev/1_deployment.yaml_
to enable Flux to perform the automatic deployment:

`streams-{{cookiecutter.project_slug}}/k8s/dev`

In the yaml file go to _spec.template.spec.containers.name.args_, element _--git-path_, and add it to the end of the list, taking care of commas and single quotes.
