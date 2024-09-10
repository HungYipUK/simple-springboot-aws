#!/bin/bash
echo "start application..."

DEPLOY_DIR="/opt/codedeploy-agent/deployment-root/$DEPLOYMENT_GROUP_ID/$DEPLOYMENT_ID/deployment-archive"

nohup java -jar $DEPLOY_DIR/target/simple-springboot-0.0.1-SNAPSHOT.jar > $DEPLOY_DIR/app.log 2>&1 & echo $! > /application/app.pid