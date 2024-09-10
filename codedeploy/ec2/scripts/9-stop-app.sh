#!/bin/bash
echo "stop application..."

DEPLOY_DIR="/opt/codedeploy-agent/deployment-root/$DEPLOYMENT_GROUP_ID/$DEPLOYMENT_ID/deployment-archive"
SPRINGBOOT_PID=`cat /application/app.pid`

echo "kill java process $SPRINGBOOT_PID ..."

kill -9 $SPRINGBOOT_PID