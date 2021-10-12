FROM node:lts-alpine as build-stage
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
# $BACKEND_URL ARG will be set from docker build command with --build-arg
ARG BACKEND_URL
ENV REACT_APP_BACKEND_URL=${BACKEND_URL}
RUN npm run build

# production stage
FROM nginx:stable-alpine as production-stage
COPY --from=build-stage /app/build /usr/share/nginx/html
COPY ./nginx.conf /app/nginx.conf
RUN envsubst /app < /app/nginx.conf > /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]