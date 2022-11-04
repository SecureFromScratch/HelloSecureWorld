import os.path
import sys

safe_dir = '/c/output_files'
requested_path = sys.argv[1]
result = int(sys.argv[2]) + 1

requested_path = os.path.realpath(requested_path)
if os.path.commonprefix((requested_path, safe_dir)) != safe_dir: 
    raise PermissionError()

with open(requested_path, 'w') as f:
    f.write(str(result))
    f.write('\n')
