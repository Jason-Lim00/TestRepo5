import six
# ruleid:httpsconnection-detected
six.moves.http_client.HTTPSConnection("example.com")

# ok:httpsconnection-detected
raise http.client.HTTPException

if extraHeaders:
        headers.update(extraHeaders)
        conn = http.client.HTTPSConnection(host, 443,
                                           context = ssl._create_unverified_context())
requestQueryParams = "?" + params if params else ""
conn.request(method, host + url + requestQueryParams, json.dumps(data), headers)
