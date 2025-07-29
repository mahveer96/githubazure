#!/bin/bash

# Replace with your ACR name and email
ACR_NAME="microser"
EMAIL="mahesh.tella@gmail.com"

USERNAME=$(az acr credential show --name $ACR_NAME --query "username" -o tsv)
PASSWORD=$(az acr credential show --name $ACR_NAME --query "passwords[0].value" -o tsv)

kubectl create secret docker-registry acr-auth \
  --docker-server=$ACR_NAME.azurecr.io \
  --docker-username=$USERNAME \
  --docker-password=$PASSWORD \
  --docker-email=$EMAIL
