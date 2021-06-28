package tauseefahmedgithubapi

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.client.annotation.Client

import static io.micronaut.http.HttpHeaders.USER_AGENT

@Client('https://api.github.com/')
interface GitHubClient {

    @Get('/orgs/{org}/repos')
    @Header(name = USER_AGENT, value = 'Micronaut Demo Application')
    List<GitHubRepository> listRepositoriesForOrginazation(String org)
}
